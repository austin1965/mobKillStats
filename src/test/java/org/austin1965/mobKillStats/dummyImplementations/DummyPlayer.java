package org.austin1965.mobKillStats.dummyImplementations;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.sign.Side;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.damage.DamageSource;
import org.bukkit.entity.*;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public class DummyPlayer implements Player {
  String displayName;

  @Override
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public boolean isOnline() {
    return false;
  }

  @Override
  public String getName() {
    return "";
  }

  @Override
  public PlayerInventory getInventory() {
    return null;
  }

  @Override
  public Inventory getEnderChest() {
    return null;
  }

  @Override
  public MainHand getMainHand() {
    return null;
  }

  @Override
  public boolean setWindowProperty(InventoryView.Property prop, int value) {
    return false;
  }

  @Override
  public int getEnchantmentSeed() {
    return 0;
  }

  @Override
  public void setEnchantmentSeed(int seed) {}

  @Override
  public InventoryView getOpenInventory() {
    return null;
  }

  @Override
  public InventoryView openInventory(Inventory inventory) {
    return null;
  }

  @Override
  public InventoryView openWorkbench(Location location, boolean force) {
    return null;
  }

  @Override
  public InventoryView openEnchanting(Location location, boolean force) {
    return null;
  }

  @Override
  public void openInventory(InventoryView inventory) {}

  @Override
  public InventoryView openMerchant(Villager trader, boolean force) {
    return null;
  }

  @Override
  public InventoryView openMerchant(Merchant merchant, boolean force) {
    return null;
  }

  @Override
  public void closeInventory() {}

  @Override
  public ItemStack getItemInHand() {
    return null;
  }

  @Override
  public void setItemInHand(ItemStack item) {}

  @Override
  public ItemStack getItemOnCursor() {
    return null;
  }

  @Override
  public void setItemOnCursor(ItemStack item) {}

  @Override
  public boolean hasCooldown(Material material) {
    return false;
  }

  @Override
  public int getCooldown(Material material) {
    return 0;
  }

  @Override
  public void setCooldown(Material material, int ticks) {}

  @Override
  public int getSleepTicks() {
    return 0;
  }

  @Override
  public boolean sleep(Location location, boolean force) {
    return false;
  }

  @Override
  public void wakeup(boolean setSpawnLocation) {}

  @Override
  public void startRiptideAttack(int duration, float attackStrength, ItemStack attackItem) {}

  @Override
  public Location getBedLocation() {
    return null;
  }

  @Override
  public GameMode getGameMode() {
    return null;
  }

  @Override
  public void setGameMode(GameMode mode) {}

  @Override
  public boolean isBlocking() {
    return false;
  }

  @Override
  public boolean isHandRaised() {
    return false;
  }

  @Override
  public int getExpToLevel() {
    return 0;
  }

  @Override
  public float getAttackCooldown() {
    return 0;
  }

  @Override
  public boolean discoverRecipe(NamespacedKey recipe) {
    return false;
  }

  @Override
  public int discoverRecipes(Collection<NamespacedKey> recipes) {
    return 0;
  }

  @Override
  public boolean undiscoverRecipe(NamespacedKey recipe) {
    return false;
  }

  @Override
  public int undiscoverRecipes(Collection<NamespacedKey> recipes) {
    return 0;
  }

  @Override
  public boolean hasDiscoveredRecipe(NamespacedKey recipe) {
    return false;
  }

  @Override
  public Set<NamespacedKey> getDiscoveredRecipes() {
    return Set.of();
  }

  @Override
  public Entity getShoulderEntityLeft() {
    return null;
  }

  @Override
  public void setShoulderEntityLeft(Entity entity) {}

  @Override
  public Entity getShoulderEntityRight() {
    return null;
  }

  @Override
  public void setShoulderEntityRight(Entity entity) {}

  @Override
  public boolean dropItem(boolean dropAll) {
    return false;
  }

  @Override
  public float getExhaustion() {
    return 0;
  }

  @Override
  public void setExhaustion(float value) {}

  @Override
  public float getSaturation() {
    return 0;
  }

  @Override
  public void setSaturation(float value) {}

  @Override
  public int getFoodLevel() {
    return 0;
  }

  @Override
  public void setFoodLevel(int value) {}

  @Override
  public int getSaturatedRegenRate() {
    return 0;
  }

  @Override
  public void setSaturatedRegenRate(int ticks) {}

  @Override
  public int getUnsaturatedRegenRate() {
    return 0;
  }

  @Override
  public void setUnsaturatedRegenRate(int ticks) {}

  @Override
  public int getStarvationRate() {
    return 0;
  }

  @Override
  public void setStarvationRate(int ticks) {}

  @Override
  public Location getLastDeathLocation() {
    return null;
  }

  @Override
  public void setLastDeathLocation(Location location) {}

  @Override
  public Firework fireworkBoost(ItemStack fireworkItemStack) {
    return null;
  }

  @Override
  public PlayerProfile getPlayerProfile() {
    return null;
  }

  @Override
  public boolean isBanned() {
    return false;
  }

  @Override
  public BanEntry<PlayerProfile> ban(String reason, Date expires, String source) {
    return null;
  }

  @Override
  public BanEntry<PlayerProfile> ban(String reason, Instant expires, String source) {
    return null;
  }

  @Override
  public BanEntry<PlayerProfile> ban(String reason, Duration duration, String source) {
    return null;
  }

  @Override
  public boolean isWhitelisted() {
    return false;
  }

  @Override
  public void setWhitelisted(boolean value) {}

  @Override
  public Player getPlayer() {
    return null;
  }

  @Override
  public long getFirstPlayed() {
    return 0;
  }

  @Override
  public long getLastPlayed() {
    return 0;
  }

  @Override
  public boolean hasPlayedBefore() {
    return false;
  }

  @Override
  public String getDisplayName() {
    return displayName;
  }

  @Override
  public String getPlayerListName() {
    return "";
  }

  @Override
  public void setPlayerListName(String name) {}

  @Override
  public String getPlayerListHeader() {
    return "";
  }

  @Override
  public String getPlayerListFooter() {
    return "";
  }

  @Override
  public void setPlayerListHeader(String header) {}

  @Override
  public void setPlayerListFooter(String footer) {}

  @Override
  public void setPlayerListHeaderFooter(String header, String footer) {}

  @Override
  public void setCompassTarget(Location loc) {}

  @Override
  public Location getCompassTarget() {
    return null;
  }

  @Override
  public InetSocketAddress getAddress() {
    return null;
  }

  @Override
  public boolean isTransferred() {
    return false;
  }

  @Override
  public CompletableFuture<byte[]> retrieveCookie(NamespacedKey key) {
    return null;
  }

  @Override
  public void storeCookie(NamespacedKey key, byte[] value) {}

  @Override
  public void transfer(String host, int port) {}

  @Override
  public boolean isConversing() {
    return false;
  }

  @Override
  public void acceptConversationInput(String input) {}

  @Override
  public boolean beginConversation(Conversation conversation) {
    return false;
  }

  @Override
  public void abandonConversation(Conversation conversation) {}

  @Override
  public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {}

  @Override
  public void sendRawMessage(String message) {}

  @Override
  public void sendRawMessage(UUID sender, String message) {}

  @Override
  public void kickPlayer(String message) {}

  @Override
  public BanEntry<PlayerProfile> ban(
      String reason, Date expires, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public BanEntry<PlayerProfile> ban(
      String reason, Instant expires, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public BanEntry<PlayerProfile> ban(
      String reason, Duration duration, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public BanEntry<InetAddress> banIp(
      String reason, Date expires, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public BanEntry<InetAddress> banIp(
      String reason, Instant expires, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public BanEntry<InetAddress> banIp(
      String reason, Duration duration, String source, boolean kickPlayer) {
    return null;
  }

  @Override
  public void chat(String msg) {}

  @Override
  public boolean performCommand(String command) {
    return false;
  }

  @Override
  public Location getLocation() {
    return null;
  }

  @Override
  public Location getLocation(Location loc) {
    return null;
  }

  @Override
  public void setVelocity(Vector velocity) {}

  @Override
  public Vector getVelocity() {
    return null;
  }

  @Override
  public double getHeight() {
    return 0;
  }

  @Override
  public double getWidth() {
    return 0;
  }

  @Override
  public BoundingBox getBoundingBox() {
    return null;
  }

  @Override
  public boolean isOnGround() {
    return false;
  }

  @Override
  public boolean isInWater() {
    return false;
  }

  @Override
  public World getWorld() {
    return null;
  }

  @Override
  public void setRotation(float yaw, float pitch) {}

  @Override
  public boolean teleport(Location location) {
    return false;
  }

  @Override
  public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
    return false;
  }

  @Override
  public boolean teleport(Entity destination) {
    return false;
  }

  @Override
  public boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause) {
    return false;
  }

  @Override
  public List<Entity> getNearbyEntities(double x, double y, double z) {
    return List.of();
  }

  @Override
  public int getEntityId() {
    return 0;
  }

  @Override
  public int getFireTicks() {
    return 0;
  }

  @Override
  public int getMaxFireTicks() {
    return 0;
  }

  @Override
  public void setFireTicks(int ticks) {}

  @Override
  public void setVisualFire(boolean fire) {}

  @Override
  public boolean isVisualFire() {
    return false;
  }

  @Override
  public int getFreezeTicks() {
    return 0;
  }

  @Override
  public int getMaxFreezeTicks() {
    return 0;
  }

  @Override
  public void setFreezeTicks(int ticks) {}

  @Override
  public boolean isFrozen() {
    return false;
  }

  @Override
  public void remove() {}

  @Override
  public boolean isDead() {
    return false;
  }

  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public void sendMessage(String message) {}

  @Override
  public void sendMessage(String... messages) {}

  @Override
  public void sendMessage(UUID sender, String message) {}

  @Override
  public void sendMessage(UUID sender, String... messages) {}

  @Override
  public Server getServer() {
    return null;
  }

  @Override
  public boolean isPersistent() {
    return false;
  }

  @Override
  public void setPersistent(boolean persistent) {}

  @Override
  public Entity getPassenger() {
    return null;
  }

  @Override
  public boolean setPassenger(Entity passenger) {
    return false;
  }

  @Override
  public List<Entity> getPassengers() {
    return List.of();
  }

  @Override
  public boolean addPassenger(Entity passenger) {
    return false;
  }

  @Override
  public boolean removePassenger(Entity passenger) {
    return false;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean eject() {
    return false;
  }

  @Override
  public float getFallDistance() {
    return 0;
  }

  @Override
  public void setFallDistance(float distance) {}

  @Override
  public void setLastDamageCause(EntityDamageEvent event) {}

  @Override
  public EntityDamageEvent getLastDamageCause() {
    return null;
  }

  @Override
  public UUID getUniqueId() {
    return null;
  }

  @Override
  public int getTicksLived() {
    return 0;
  }

  @Override
  public void setTicksLived(int value) {}

  @Override
  public void playEffect(EntityEffect type) {}

  @Override
  public EntityType getType() {
    return null;
  }

  @Override
  public Sound getSwimSound() {
    return null;
  }

  @Override
  public Sound getSwimSplashSound() {
    return null;
  }

  @Override
  public Sound getSwimHighSpeedSplashSound() {
    return null;
  }

  @Override
  public boolean isInsideVehicle() {
    return false;
  }

  @Override
  public boolean leaveVehicle() {
    return false;
  }

  @Override
  public Entity getVehicle() {
    return null;
  }

  @Override
  public void setCustomNameVisible(boolean flag) {}

  @Override
  public boolean isCustomNameVisible() {
    return false;
  }

  @Override
  public void setVisibleByDefault(boolean visible) {}

  @Override
  public boolean isVisibleByDefault() {
    return false;
  }

  @Override
  public Set<Player> getTrackedBy() {
    return Set.of();
  }

  @Override
  public void setGlowing(boolean flag) {}

  @Override
  public boolean isGlowing() {
    return false;
  }

  @Override
  public void setInvulnerable(boolean flag) {}

  @Override
  public boolean isInvulnerable() {
    return false;
  }

  @Override
  public boolean isSilent() {
    return false;
  }

  @Override
  public void setSilent(boolean flag) {}

  @Override
  public boolean hasGravity() {
    return false;
  }

  @Override
  public void setGravity(boolean gravity) {}

  @Override
  public int getPortalCooldown() {
    return 0;
  }

  @Override
  public void setPortalCooldown(int cooldown) {}

  @Override
  public Set<String> getScoreboardTags() {
    return Set.of();
  }

  @Override
  public boolean addScoreboardTag(String tag) {
    return false;
  }

  @Override
  public boolean removeScoreboardTag(String tag) {
    return false;
  }

  @Override
  public PistonMoveReaction getPistonMoveReaction() {
    return null;
  }

  @Override
  public BlockFace getFacing() {
    return null;
  }

  @Override
  public Pose getPose() {
    return null;
  }

  @Override
  public SpawnCategory getSpawnCategory() {
    return null;
  }

  @Override
  public boolean isInWorld() {
    return false;
  }

  @Override
  public String getAsString() {
    return "";
  }

  @Override
  public EntitySnapshot createSnapshot() {
    return null;
  }

  @Override
  public Entity copy() {
    return null;
  }

  @Override
  public Entity copy(Location to) {
    return null;
  }

  @Override
  public boolean isSneaking() {
    return false;
  }

  @Override
  public void setSneaking(boolean sneak) {}

  @Override
  public boolean isSprinting() {
    return false;
  }

  @Override
  public void setSprinting(boolean sprinting) {}

  @Override
  public void saveData() {}

  @Override
  public void loadData() {}

  @Override
  public void setSleepingIgnored(boolean isSleeping) {}

  @Override
  public boolean isSleepingIgnored() {
    return false;
  }

  @Override
  public Location getBedSpawnLocation() {
    return null;
  }

  @Override
  public Location getRespawnLocation() {
    return null;
  }

  @Override
  public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {}

  @Override
  public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {}

  @Override
  public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {}

  @Override
  public int getStatistic(Statistic statistic) throws IllegalArgumentException {
    return 0;
  }

  @Override
  public void incrementStatistic(Statistic statistic, Material material)
      throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic, Material material)
      throws IllegalArgumentException {}

  @Override
  public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
    return 0;
  }

  @Override
  public void incrementStatistic(Statistic statistic, Material material, int amount)
      throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic, Material material, int amount)
      throws IllegalArgumentException {}

  @Override
  public void setStatistic(Statistic statistic, Material material, int newValue)
      throws IllegalArgumentException {}

  @Override
  public void incrementStatistic(Statistic statistic, EntityType entityType)
      throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic, EntityType entityType)
      throws IllegalArgumentException {}

  @Override
  public int getStatistic(Statistic statistic, EntityType entityType)
      throws IllegalArgumentException {
    return 0;
  }

  @Override
  public void incrementStatistic(Statistic statistic, EntityType entityType, int amount)
      throws IllegalArgumentException {}

  @Override
  public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {}

  @Override
  public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {}

  @Override
  public void setBedSpawnLocation(Location location) {}

  @Override
  public void setRespawnLocation(Location location) {}

  @Override
  public void setBedSpawnLocation(Location location, boolean force) {}

  @Override
  public void setRespawnLocation(Location location, boolean force) {}

  @Override
  public void playNote(Location loc, byte instrument, byte note) {}

  @Override
  public void playNote(Location loc, Instrument instrument, Note note) {}

  @Override
  public void playSound(Location location, Sound sound, float volume, float pitch) {}

  @Override
  public void playSound(Location location, String sound, float volume, float pitch) {}

  @Override
  public void playSound(
      Location location, Sound sound, SoundCategory category, float volume, float pitch) {}

  @Override
  public void playSound(
      Location location, String sound, SoundCategory category, float volume, float pitch) {}

  @Override
  public void playSound(
      Location location,
      Sound sound,
      SoundCategory category,
      float volume,
      float pitch,
      long seed) {}

  @Override
  public void playSound(
      Location location,
      String sound,
      SoundCategory category,
      float volume,
      float pitch,
      long seed) {}

  @Override
  public void playSound(Entity entity, Sound sound, float volume, float pitch) {}

  @Override
  public void playSound(Entity entity, String sound, float volume, float pitch) {}

  @Override
  public void playSound(
      Entity entity, Sound sound, SoundCategory category, float volume, float pitch) {}

  @Override
  public void playSound(
      Entity entity, String sound, SoundCategory category, float volume, float pitch) {}

  @Override
  public void playSound(
      Entity entity, Sound sound, SoundCategory category, float volume, float pitch, long seed) {}

  @Override
  public void playSound(
      Entity entity, String sound, SoundCategory category, float volume, float pitch, long seed) {}

  @Override
  public void stopSound(Sound sound) {}

  @Override
  public void stopSound(String sound) {}

  @Override
  public void stopSound(Sound sound, SoundCategory category) {}

  @Override
  public void stopSound(String sound, SoundCategory category) {}

  @Override
  public void stopSound(SoundCategory category) {}

  @Override
  public void stopAllSounds() {}

  @Override
  public void playEffect(Location loc, Effect effect, int data) {}

  @Override
  public <T> void playEffect(Location loc, Effect effect, T data) {}

  @Override
  public boolean breakBlock(Block block) {
    return false;
  }

  @Override
  public void sendBlockChange(Location loc, Material material, byte data) {}

  @Override
  public void sendBlockChange(Location loc, BlockData block) {}

  @Override
  public void sendBlockChanges(Collection<BlockState> blocks) {}

  @Override
  public void sendBlockChanges(Collection<BlockState> blocks, boolean suppressLightUpdates) {}

  @Override
  public void sendBlockDamage(Location loc, float progress) {}

  @Override
  public void sendBlockDamage(Location loc, float progress, Entity source) {}

  @Override
  public void sendBlockDamage(Location loc, float progress, int sourceId) {}

  @Override
  public void sendEquipmentChange(LivingEntity entity, EquipmentSlot slot, ItemStack item) {}

  @Override
  public void sendEquipmentChange(LivingEntity entity, Map<EquipmentSlot, ItemStack> items) {}

  @Override
  public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {}

  @Override
  public void sendSignChange(Location loc, String[] lines, DyeColor dyeColor)
      throws IllegalArgumentException {}

  @Override
  public void sendSignChange(
      Location loc, String[] lines, DyeColor dyeColor, boolean hasGlowingText)
      throws IllegalArgumentException {}

  @Override
  public void sendBlockUpdate(Location loc, TileState tileState) throws IllegalArgumentException {}

  @Override
  public void sendPotionEffectChange(LivingEntity entity, PotionEffect effect) {}

  @Override
  public void sendPotionEffectChangeRemove(LivingEntity entity, PotionEffectType type) {}

  @Override
  public void sendMap(MapView map) {}

  @Override
  public void sendHurtAnimation(float yaw) {}

  @Override
  public void sendLinks(ServerLinks links) {}

  @Override
  public void addCustomChatCompletions(Collection<String> completions) {}

  @Override
  public void removeCustomChatCompletions(Collection<String> completions) {}

  @Override
  public void setCustomChatCompletions(Collection<String> completions) {}

  @Override
  public void updateInventory() {}

  @Override
  public GameMode getPreviousGameMode() {
    return null;
  }

  @Override
  public void setPlayerTime(long time, boolean relative) {}

  @Override
  public long getPlayerTime() {
    return 0;
  }

  @Override
  public long getPlayerTimeOffset() {
    return 0;
  }

  @Override
  public boolean isPlayerTimeRelative() {
    return false;
  }

  @Override
  public void resetPlayerTime() {}

  @Override
  public void setPlayerWeather(WeatherType type) {}

  @Override
  public WeatherType getPlayerWeather() {
    return null;
  }

  @Override
  public void resetPlayerWeather() {}

  @Override
  public int getExpCooldown() {
    return 0;
  }

  @Override
  public void setExpCooldown(int ticks) {}

  @Override
  public void giveExp(int amount) {}

  @Override
  public void giveExpLevels(int amount) {}

  @Override
  public float getExp() {
    return 0;
  }

  @Override
  public void setExp(float exp) {}

  @Override
  public int getLevel() {
    return 0;
  }

  @Override
  public void setLevel(int level) {}

  @Override
  public int getTotalExperience() {
    return 0;
  }

  @Override
  public void setTotalExperience(int exp) {}

  @Override
  public void sendExperienceChange(float progress) {}

  @Override
  public void sendExperienceChange(float progress, int level) {}

  @Override
  public boolean getAllowFlight() {
    return false;
  }

  @Override
  public void setAllowFlight(boolean flight) {}

  @Override
  public void hidePlayer(Player player) {}

  @Override
  public void hidePlayer(Plugin plugin, Player player) {}

  @Override
  public void showPlayer(Player player) {}

  @Override
  public void showPlayer(Plugin plugin, Player player) {}

  @Override
  public boolean canSee(Player player) {
    return false;
  }

  @Override
  public void hideEntity(Plugin plugin, Entity entity) {}

  @Override
  public void showEntity(Plugin plugin, Entity entity) {}

  @Override
  public boolean canSee(Entity entity) {
    return false;
  }

  @Override
  public boolean isFlying() {
    return false;
  }

  @Override
  public void setFlying(boolean value) {}

  @Override
  public void setFlySpeed(float value) throws IllegalArgumentException {}

  @Override
  public void setWalkSpeed(float value) throws IllegalArgumentException {}

  @Override
  public float getFlySpeed() {
    return 0;
  }

  @Override
  public float getWalkSpeed() {
    return 0;
  }

  @Override
  public void setTexturePack(String url) {}

  @Override
  public void setResourcePack(String url) {}

  @Override
  public void setResourcePack(String url, byte[] hash) {}

  @Override
  public void setResourcePack(String url, byte[] hash, String prompt) {}

  @Override
  public void setResourcePack(String url, byte[] hash, boolean force) {}

  @Override
  public void setResourcePack(String url, byte[] hash, String prompt, boolean force) {}

  @Override
  public void setResourcePack(UUID id, String url, byte[] hash, String prompt, boolean force) {}

  @Override
  public void addResourcePack(UUID id, String url, byte[] hash, String prompt, boolean force) {}

  @Override
  public void removeResourcePack(UUID id) {}

  @Override
  public void removeResourcePacks() {}

  @Override
  public Scoreboard getScoreboard() {
    return null;
  }

  @Override
  public void setScoreboard(Scoreboard scoreboard)
      throws IllegalArgumentException, IllegalStateException {}

  @Override
  public WorldBorder getWorldBorder() {
    return null;
  }

  @Override
  public void setWorldBorder(WorldBorder border) {}

  @Override
  public void sendHealthUpdate(double health, int foodLevel, float saturation) {}

  @Override
  public void sendHealthUpdate() {}

  @Override
  public boolean isHealthScaled() {
    return false;
  }

  @Override
  public void setHealthScaled(boolean scale) {}

  @Override
  public void setHealthScale(double scale) throws IllegalArgumentException {}

  @Override
  public double getHealthScale() {
    return 0;
  }

  @Override
  public Entity getSpectatorTarget() {
    return null;
  }

  @Override
  public void setSpectatorTarget(Entity entity) {}

  @Override
  public void sendTitle(String title, String subtitle) {}

  @Override
  public void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut) {}

  @Override
  public void resetTitle() {}

  @Override
  public void spawnParticle(Particle particle, Location location, int count) {}

  @Override
  public void spawnParticle(Particle particle, double x, double y, double z, int count) {}

  @Override
  public <T> void spawnParticle(Particle particle, Location location, int count, T data) {}

  @Override
  public <T> void spawnParticle(
      Particle particle, double x, double y, double z, int count, T data) {}

  @Override
  public void spawnParticle(
      Particle particle,
      Location location,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ) {}

  @Override
  public void spawnParticle(
      Particle particle,
      double x,
      double y,
      double z,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      Location location,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      T data) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      double x,
      double y,
      double z,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      T data) {}

  @Override
  public void spawnParticle(
      Particle particle,
      Location location,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra) {}

  @Override
  public void spawnParticle(
      Particle particle,
      double x,
      double y,
      double z,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      Location location,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra,
      T data) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      double x,
      double y,
      double z,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra,
      T data) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      Location location,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra,
      T data,
      boolean force) {}

  @Override
  public <T> void spawnParticle(
      Particle particle,
      double x,
      double y,
      double z,
      int count,
      double offsetX,
      double offsetY,
      double offsetZ,
      double extra,
      T data,
      boolean force) {}

  @Override
  public AdvancementProgress getAdvancementProgress(Advancement advancement) {
    return null;
  }

  @Override
  public int getClientViewDistance() {
    return 0;
  }

  @Override
  public int getPing() {
    return 0;
  }

  @Override
  public String getLocale() {
    return "";
  }

  @Override
  public void updateCommands() {}

  @Override
  public void openBook(ItemStack book) {}

  @Override
  public void openSign(Sign sign) {}

  @Override
  public void openSign(Sign sign, Side side) {}

  @Override
  public void showDemoScreen() {}

  @Override
  public boolean isAllowingServerListings() {
    return false;
  }

  @Override
  public Spigot spigot() {
    return null;
  }

  @Override
  public Map<String, Object> serialize() {
    return Map.of();
  }

  @Override
  public double getEyeHeight() {
    return 0;
  }

  @Override
  public double getEyeHeight(boolean ignorePose) {
    return 0;
  }

  @Override
  public Location getEyeLocation() {
    return null;
  }

  @Override
  public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
    return List.of();
  }

  @Override
  public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
    return null;
  }

  @Override
  public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
    return List.of();
  }

  @Override
  public Block getTargetBlockExact(int maxDistance) {
    return null;
  }

  @Override
  public Block getTargetBlockExact(int maxDistance, FluidCollisionMode fluidCollisionMode) {
    return null;
  }

  @Override
  public RayTraceResult rayTraceBlocks(double maxDistance) {
    return null;
  }

  @Override
  public RayTraceResult rayTraceBlocks(double maxDistance, FluidCollisionMode fluidCollisionMode) {
    return null;
  }

  @Override
  public int getRemainingAir() {
    return 0;
  }

  @Override
  public void setRemainingAir(int ticks) {}

  @Override
  public int getMaximumAir() {
    return 0;
  }

  @Override
  public void setMaximumAir(int ticks) {}

  @Override
  public ItemStack getItemInUse() {
    return null;
  }

  @Override
  public int getItemInUseTicks() {
    return 0;
  }

  @Override
  public void setItemInUseTicks(int ticks) {}

  @Override
  public int getArrowCooldown() {
    return 0;
  }

  @Override
  public void setArrowCooldown(int ticks) {}

  @Override
  public int getArrowsInBody() {
    return 0;
  }

  @Override
  public void setArrowsInBody(int count) {}

  @Override
  public int getMaximumNoDamageTicks() {
    return 0;
  }

  @Override
  public void setMaximumNoDamageTicks(int ticks) {}

  @Override
  public double getLastDamage() {
    return 0;
  }

  @Override
  public void setLastDamage(double damage) {}

  @Override
  public int getNoDamageTicks() {
    return 0;
  }

  @Override
  public void setNoDamageTicks(int ticks) {}

  @Override
  public int getNoActionTicks() {
    return 0;
  }

  @Override
  public void setNoActionTicks(int ticks) {}

  @Override
  public Player getKiller() {
    return null;
  }

  @Override
  public boolean addPotionEffect(PotionEffect effect) {
    return false;
  }

  @Override
  public boolean addPotionEffect(PotionEffect effect, boolean force) {
    return false;
  }

  @Override
  public boolean addPotionEffects(Collection<PotionEffect> effects) {
    return false;
  }

  @Override
  public boolean hasPotionEffect(PotionEffectType type) {
    return false;
  }

  @Override
  public PotionEffect getPotionEffect(PotionEffectType type) {
    return null;
  }

  @Override
  public void removePotionEffect(PotionEffectType type) {}

  @Override
  public Collection<PotionEffect> getActivePotionEffects() {
    return List.of();
  }

  @Override
  public boolean hasLineOfSight(Entity other) {
    return false;
  }

  @Override
  public boolean getRemoveWhenFarAway() {
    return false;
  }

  @Override
  public void setRemoveWhenFarAway(boolean remove) {}

  @Override
  public EntityEquipment getEquipment() {
    return null;
  }

  @Override
  public void setCanPickupItems(boolean pickup) {}

  @Override
  public boolean getCanPickupItems() {
    return false;
  }

  @Override
  public boolean isLeashed() {
    return false;
  }

  @Override
  public Entity getLeashHolder() throws IllegalStateException {
    return null;
  }

  @Override
  public boolean setLeashHolder(Entity holder) {
    return false;
  }

  @Override
  public boolean isGliding() {
    return false;
  }

  @Override
  public void setGliding(boolean gliding) {}

  @Override
  public boolean isSwimming() {
    return false;
  }

  @Override
  public void setSwimming(boolean swimming) {}

  @Override
  public boolean isRiptiding() {
    return false;
  }

  @Override
  public void setRiptiding(boolean riptiding) {}

  @Override
  public boolean isSleeping() {
    return false;
  }

  @Override
  public boolean isClimbing() {
    return false;
  }

  @Override
  public void setAI(boolean ai) {}

  @Override
  public boolean hasAI() {
    return false;
  }

  @Override
  public void attack(Entity target) {}

  @Override
  public void swingMainHand() {}

  @Override
  public void swingOffHand() {}

  @Override
  public void playHurtAnimation(float yaw) {}

  @Override
  public void setCollidable(boolean collidable) {}

  @Override
  public boolean isCollidable() {
    return false;
  }

  @Override
  public Set<UUID> getCollidableExemptions() {
    return Set.of();
  }

  @Override
  public <T> T getMemory(MemoryKey<T> memoryKey) {
    return null;
  }

  @Override
  public <T> void setMemory(MemoryKey<T> memoryKey, T memoryValue) {}

  @Override
  public Sound getHurtSound() {
    return null;
  }

  @Override
  public Sound getDeathSound() {
    return null;
  }

  @Override
  public Sound getFallDamageSound(int fallHeight) {
    return null;
  }

  @Override
  public Sound getFallDamageSoundSmall() {
    return null;
  }

  @Override
  public Sound getFallDamageSoundBig() {
    return null;
  }

  @Override
  public Sound getDrinkingSound(ItemStack itemStack) {
    return null;
  }

  @Override
  public Sound getEatingSound(ItemStack itemStack) {
    return null;
  }

  @Override
  public boolean canBreatheUnderwater() {
    return false;
  }

  @Override
  public EntityCategory getCategory() {
    return null;
  }

  @Override
  public void setInvisible(boolean invisible) {}

  @Override
  public boolean isInvisible() {
    return false;
  }

  @Override
  public AttributeInstance getAttribute(Attribute attribute) {
    return null;
  }

  @Override
  public void damage(double amount) {}

  @Override
  public void damage(double amount, Entity source) {}

  @Override
  public void damage(double amount, DamageSource damageSource) {}

  @Override
  public double getHealth() {
    return 0;
  }

  @Override
  public void setHealth(double health) {}

  @Override
  public double getAbsorptionAmount() {
    return 0;
  }

  @Override
  public void setAbsorptionAmount(double amount) {}

  @Override
  public double getMaxHealth() {
    return 0;
  }

  @Override
  public void setMaxHealth(double health) {}

  @Override
  public void resetMaxHealth() {}

  @Override
  public String getCustomName() {
    return "";
  }

  @Override
  public void setCustomName(String name) {}

  @Override
  public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {}

  @Override
  public List<MetadataValue> getMetadata(String metadataKey) {
    return List.of();
  }

  @Override
  public boolean hasMetadata(String metadataKey) {
    return false;
  }

  @Override
  public void removeMetadata(String metadataKey, Plugin owningPlugin) {}

  @Override
  public boolean isPermissionSet(String name) {
    return false;
  }

  @Override
  public boolean isPermissionSet(Permission perm) {
    return false;
  }

  @Override
  public boolean hasPermission(String name) {
    return false;
  }

  @Override
  public boolean hasPermission(Permission perm) {
    return false;
  }

  @Override
  public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
    return null;
  }

  @Override
  public PermissionAttachment addAttachment(Plugin plugin) {
    return null;
  }

  @Override
  public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
    return null;
  }

  @Override
  public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
    return null;
  }

  @Override
  public void removeAttachment(PermissionAttachment attachment) {}

  @Override
  public void recalculatePermissions() {}

  @Override
  public Set<PermissionAttachmentInfo> getEffectivePermissions() {
    return Set.of();
  }

  @Override
  public boolean isOp() {
    return false;
  }

  @Override
  public void setOp(boolean value) {}

  @Override
  public PersistentDataContainer getPersistentDataContainer() {
    return null;
  }

  @Override
  public void sendPluginMessage(Plugin source, String channel, byte[] message) {}

  @Override
  public Set<String> getListeningPluginChannels() {
    return Set.of();
  }

  @Override
  public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
    return null;
  }

  @Override
  public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
    return null;
  }
}
