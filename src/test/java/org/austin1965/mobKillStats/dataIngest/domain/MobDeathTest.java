package org.austin1965.mobKillStats.dataIngest.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MobDeathTest {

  @Test
  void shouldIdentifyMobDeathAsNaturallyCaused() {
    // given
    MobDeath mobDeath = new MobDeath(null, "some mob");

    // when
    boolean result = mobDeath.hasNaturalCause();

    // then
    assertThat(result).isTrue();
  }

  @Test
  void shouldIdentifyMobDeathAsPlayerCaused() {
    // given
    MobDeath mobDeath = new MobDeath("some player", "some mob");

    // when
    boolean result = mobDeath.hasNaturalCause();

    // then
    assertThat(result).isFalse();
  }
}
