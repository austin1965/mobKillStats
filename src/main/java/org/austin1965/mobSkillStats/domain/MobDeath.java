package org.austin1965.mobSkillStats.domain;

public class MobDeath {

  private String killerName;
  private String mobType;

  public MobDeath(String killerName, String mobType) {
    this.killerName = killerName;
    this.mobType = mobType;
  }

  public String getKillerName() {
    return killerName;
  }

  public String getMobType() {
    return mobType;
  }

  public boolean hasNaturalCause() {
    return this.killerName == null;
  }
}
