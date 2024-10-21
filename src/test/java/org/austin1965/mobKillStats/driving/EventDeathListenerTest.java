package org.austin1965.mobKillStats.driving;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.austin1965.mobKillStats.dummyImplementations.DummyLivingEntity;
import org.austin1965.mobKillStats.dummyImplementations.DummyPlayer;
import org.austin1965.mobSkillStats.application.MobSlayerService;
import org.austin1965.mobSkillStats.domain.MobDeath;
import org.austin1965.mobSkillStats.driving.EntityDeathListener;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDeathEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EventDeathListenerTest {
  @Mock MobSlayerService mobSlayerService;

  @InjectMocks EntityDeathListener classUnderTest;

  @Test
  void shouldPassMobDeathByPlayer() {
    // given
    DummyPlayer playerWhoKilledMob = new DummyPlayer();
    playerWhoKilledMob.setDisplayName("some player");

    DummyLivingEntity killedMob = new DummyLivingEntity();
    killedMob.setType(EntityType.ZOMBIE);
    killedMob.setKiller(playerWhoKilledMob);

    EntityDeathEvent killedMobEvent = new EntityDeathEvent(killedMob, null, null);

    // when
    classUnderTest.onEntityDeathEvent(killedMobEvent);

    // then
    MobDeath expectedMobDeath = new MobDeath("some player", EntityType.ZOMBIE.name());
    verify(mobSlayerService, times(1)).countMobKill(refEq(expectedMobDeath));
  }

  @Test
  void shouldPassEntityDeathEventByNaturalCauses() {
    // given
    DummyLivingEntity killedMob = new DummyLivingEntity();
    killedMob.setType(EntityType.ZOMBIE);
    killedMob.setKiller(null);

    EntityDeathEvent killedMobEvent = new EntityDeathEvent(killedMob, null, null);

    // when
    classUnderTest.onEntityDeathEvent(killedMobEvent);

    // then
    MobDeath expectedMobDeath = new MobDeath(null, EntityType.ZOMBIE.name());
    verify(mobSlayerService, times(1)).countMobKill(refEq(expectedMobDeath));
  }
}
