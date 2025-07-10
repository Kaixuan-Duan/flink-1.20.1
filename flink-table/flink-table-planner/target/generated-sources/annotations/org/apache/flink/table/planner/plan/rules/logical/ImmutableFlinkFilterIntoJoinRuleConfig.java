package org.apache.flink.table.planner.plan.rules.logical;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.apache.calcite.plan.RelRule;
import org.apache.calcite.tools.RelBuilderFactory;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFlinkFilterIntoJoinRuleConfig.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableFlinkFilterIntoJoinRuleConfig.of()}.
 */
@Generated(from = "FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableFlinkFilterIntoJoinRuleConfig
    implements FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig {
  private final RelBuilderFactory relBuilderFactory;
  private final @Nullable String description;
  private final RelRule.OperandTransform operandSupplier;
  private final boolean smart;
  private final FlinkFilterJoinRule.Predicate predicate;

  private ImmutableFlinkFilterIntoJoinRuleConfig(FlinkFilterJoinRule.Predicate predicate) {
    this.predicate = Objects.requireNonNull(predicate, "predicate");
    this.description = null;
    this.relBuilderFactory = initShim.relBuilderFactory();
    this.operandSupplier = initShim.operandSupplier();
    this.smart = initShim.isSmart();
    this.initShim = null;
  }

  private ImmutableFlinkFilterIntoJoinRuleConfig(ImmutableFlinkFilterIntoJoinRuleConfig.Builder builder) {
    this.description = builder.description;
    this.predicate = builder.predicate;
    if (builder.relBuilderFactory != null) {
      initShim.withRelBuilderFactory(builder.relBuilderFactory);
    }
    if (builder.operandSupplier != null) {
      initShim.withOperandSupplier(builder.operandSupplier);
    }
    if (builder.smartIsSet()) {
      initShim.withSmart(builder.smart);
    }
    this.relBuilderFactory = initShim.relBuilderFactory();
    this.operandSupplier = initShim.operandSupplier();
    this.smart = initShim.isSmart();
    this.initShim = null;
  }

  private ImmutableFlinkFilterIntoJoinRuleConfig(
      RelBuilderFactory relBuilderFactory,
      @Nullable String description,
      RelRule.OperandTransform operandSupplier,
      boolean smart,
      FlinkFilterJoinRule.Predicate predicate) {
    this.relBuilderFactory = relBuilderFactory;
    this.description = description;
    this.operandSupplier = operandSupplier;
    this.smart = smart;
    this.predicate = predicate;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig", generator = "Immutables")
  private final class InitShim {
    private byte relBuilderFactoryBuildStage = STAGE_UNINITIALIZED;
    private RelBuilderFactory relBuilderFactory;

    RelBuilderFactory relBuilderFactory() {
      if (relBuilderFactoryBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (relBuilderFactoryBuildStage == STAGE_UNINITIALIZED) {
        relBuilderFactoryBuildStage = STAGE_INITIALIZING;
        this.relBuilderFactory = Objects.requireNonNull(relBuilderFactoryInitialize(), "relBuilderFactory");
        relBuilderFactoryBuildStage = STAGE_INITIALIZED;
      }
      return this.relBuilderFactory;
    }

    void withRelBuilderFactory(RelBuilderFactory relBuilderFactory) {
      this.relBuilderFactory = relBuilderFactory;
      relBuilderFactoryBuildStage = STAGE_INITIALIZED;
    }

    private byte operandSupplierBuildStage = STAGE_UNINITIALIZED;
    private RelRule.OperandTransform operandSupplier;

    RelRule.OperandTransform operandSupplier() {
      if (operandSupplierBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (operandSupplierBuildStage == STAGE_UNINITIALIZED) {
        operandSupplierBuildStage = STAGE_INITIALIZING;
        this.operandSupplier = Objects.requireNonNull(operandSupplierInitialize(), "operandSupplier");
        operandSupplierBuildStage = STAGE_INITIALIZED;
      }
      return this.operandSupplier;
    }

    void withOperandSupplier(RelRule.OperandTransform operandSupplier) {
      this.operandSupplier = operandSupplier;
      operandSupplierBuildStage = STAGE_INITIALIZED;
    }

    private byte smartBuildStage = STAGE_UNINITIALIZED;
    private boolean smart;

    boolean isSmart() {
      if (smartBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (smartBuildStage == STAGE_UNINITIALIZED) {
        smartBuildStage = STAGE_INITIALIZING;
        this.smart = isSmartInitialize();
        smartBuildStage = STAGE_INITIALIZED;
      }
      return this.smart;
    }

    void withSmart(boolean smart) {
      this.smart = smart;
      smartBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (relBuilderFactoryBuildStage == STAGE_INITIALIZING) attributes.add("relBuilderFactory");
      if (operandSupplierBuildStage == STAGE_INITIALIZING) attributes.add("operandSupplier");
      if (smartBuildStage == STAGE_INITIALIZING) attributes.add("smart");
      return "Cannot build FlinkFilterIntoJoinRuleConfig, attribute initializers form cycle " + attributes;
    }
  }

  private RelBuilderFactory relBuilderFactoryInitialize() {
    return FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig.super.relBuilderFactory();
  }

  private RelRule.OperandTransform operandSupplierInitialize() {
    return FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig.super.operandSupplier();
  }

  private boolean isSmartInitialize() {
    return FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig.super.isSmart();
  }

  /**
   * @return The value of the {@code relBuilderFactory} attribute
   */
  @Override
  public RelBuilderFactory relBuilderFactory() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.relBuilderFactory()
        : this.relBuilderFactory;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public @Nullable String description() {
    return description;
  }

  /**
   * @return The value of the {@code operandSupplier} attribute
   */
  @Override
  public RelRule.OperandTransform operandSupplier() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.operandSupplier()
        : this.operandSupplier;
  }

  /**
   *Whether to try to strengthen join-type, default false. 
   */
  @Override
  public boolean isSmart() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isSmart()
        : this.smart;
  }

  /**
   * Predicate that returns whether a filter is valid in the ON clause of a join for this
   * particular kind of join. If not, Calcite will push it back to above the join.
   */
  @Override
  public FlinkFilterJoinRule.Predicate getPredicate() {
    return predicate;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relBuilderFactory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlinkFilterIntoJoinRuleConfig withRelBuilderFactory(RelBuilderFactory value) {
    if (this.relBuilderFactory == value) return this;
    RelBuilderFactory newValue = Objects.requireNonNull(value, "relBuilderFactory");
    return new ImmutableFlinkFilterIntoJoinRuleConfig(newValue, this.description, this.operandSupplier, this.smart, this.predicate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlinkFilterIntoJoinRuleConfig withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableFlinkFilterIntoJoinRuleConfig(this.relBuilderFactory, value, this.operandSupplier, this.smart, this.predicate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#operandSupplier() operandSupplier} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operandSupplier
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlinkFilterIntoJoinRuleConfig withOperandSupplier(RelRule.OperandTransform value) {
    if (this.operandSupplier == value) return this;
    RelRule.OperandTransform newValue = Objects.requireNonNull(value, "operandSupplier");
    return new ImmutableFlinkFilterIntoJoinRuleConfig(this.relBuilderFactory, this.description, newValue, this.smart, this.predicate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#isSmart() smart} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for smart
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlinkFilterIntoJoinRuleConfig withSmart(boolean value) {
    if (this.smart == value) return this;
    return new ImmutableFlinkFilterIntoJoinRuleConfig(this.relBuilderFactory, this.description, this.operandSupplier, value, this.predicate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#getPredicate() predicate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for predicate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFlinkFilterIntoJoinRuleConfig withPredicate(FlinkFilterJoinRule.Predicate value) {
    if (this.predicate == value) return this;
    FlinkFilterJoinRule.Predicate newValue = Objects.requireNonNull(value, "predicate");
    return new ImmutableFlinkFilterIntoJoinRuleConfig(this.relBuilderFactory, this.description, this.operandSupplier, this.smart, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFlinkFilterIntoJoinRuleConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFlinkFilterIntoJoinRuleConfig
        && equalTo((ImmutableFlinkFilterIntoJoinRuleConfig) another);
  }

  private boolean equalTo(ImmutableFlinkFilterIntoJoinRuleConfig another) {
    return relBuilderFactory.equals(another.relBuilderFactory)
        && Objects.equals(description, another.description)
        && operandSupplier.equals(another.operandSupplier)
        && smart == another.smart
        && predicate.equals(another.predicate);
  }

  /**
   * Computes a hash code from attributes: {@code relBuilderFactory}, {@code description}, {@code operandSupplier}, {@code smart}, {@code predicate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + relBuilderFactory.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + operandSupplier.hashCode();
    h += (h << 5) + Booleans.hashCode(smart);
    h += (h << 5) + predicate.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FlinkFilterIntoJoinRuleConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FlinkFilterIntoJoinRuleConfig")
        .omitNullValues()
        .add("relBuilderFactory", relBuilderFactory)
        .add("description", description)
        .add("operandSupplier", operandSupplier)
        .add("smart", smart)
        .add("predicate", predicate)
        .toString();
  }

  /**
   * Construct a new immutable {@code FlinkFilterIntoJoinRuleConfig} instance.
   * @param predicate The value for the {@code predicate} attribute
   * @return An immutable FlinkFilterIntoJoinRuleConfig instance
   */
  public static ImmutableFlinkFilterIntoJoinRuleConfig of(FlinkFilterJoinRule.Predicate predicate) {
    return new ImmutableFlinkFilterIntoJoinRuleConfig(predicate);
  }

  /**
   * Creates an immutable copy of a {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FlinkFilterIntoJoinRuleConfig instance
   */
  public static ImmutableFlinkFilterIntoJoinRuleConfig copyOf(FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig instance) {
    if (instance instanceof ImmutableFlinkFilterIntoJoinRuleConfig) {
      return (ImmutableFlinkFilterIntoJoinRuleConfig) instance;
    }
    return ImmutableFlinkFilterIntoJoinRuleConfig.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFlinkFilterIntoJoinRuleConfig ImmutableFlinkFilterIntoJoinRuleConfig}.
   * <pre>
   * ImmutableFlinkFilterIntoJoinRuleConfig.builder()
   *    .withRelBuilderFactory(org.apache.calcite.tools.RelBuilderFactory) // optional {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#relBuilderFactory() relBuilderFactory}
   *    .withDescription(String | null) // nullable {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#description() description}
   *    .withOperandSupplier(org.apache.calcite.plan.RelRule.OperandTransform) // optional {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#operandSupplier() operandSupplier}
   *    .withSmart(boolean) // optional {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#isSmart() smart}
   *    .withPredicate(org.apache.flink.table.planner.plan.rules.logical.FlinkFilterJoinRule.Predicate) // required {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#getPredicate() predicate}
   *    .build();
   * </pre>
   * @return A new ImmutableFlinkFilterIntoJoinRuleConfig builder
   */
  public static ImmutableFlinkFilterIntoJoinRuleConfig.Builder builder() {
    return new ImmutableFlinkFilterIntoJoinRuleConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFlinkFilterIntoJoinRuleConfig ImmutableFlinkFilterIntoJoinRuleConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PREDICATE = 0x1L;
    private static final long OPT_BIT_SMART = 0x1L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable RelBuilderFactory relBuilderFactory;
    private @Nullable String description;
    private @Nullable RelRule.OperandTransform operandSupplier;
    private boolean smart;
    private @Nullable FlinkFilterJoinRule.Predicate predicate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.apache.calcite.plan.RelRule.Config} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RelRule.Config instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.apache.flink.table.planner.plan.rules.logical.FlinkFilterJoinRule.Config} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(FlinkFilterJoinRule.Config instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.apache.flink.table.planner.plan.rules.logical.FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof RelRule.Config) {
        RelRule.Config instance = (RelRule.Config) object;
        withRelBuilderFactory(instance.relBuilderFactory());
        withOperandSupplier(instance.operandSupplier());
        @Nullable String descriptionValue = instance.description();
        if (descriptionValue != null) {
          withDescription(descriptionValue);
        }
      }
      if (object instanceof FlinkFilterJoinRule.Config) {
        FlinkFilterJoinRule.Config instance = (FlinkFilterJoinRule.Config) object;
        withPredicate(instance.getPredicate());
        withSmart(instance.isSmart());
      }
    }

    /**
     * Initializes the value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#relBuilderFactory() relBuilderFactory}.</em>
     * @param relBuilderFactory The value for relBuilderFactory 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withRelBuilderFactory(RelBuilderFactory relBuilderFactory) {
      this.relBuilderFactory = Objects.requireNonNull(relBuilderFactory, "relBuilderFactory");
      return this;
    }

    /**
     * Initializes the value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withDescription(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#operandSupplier() operandSupplier} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#operandSupplier() operandSupplier}.</em>
     * @param operandSupplier The value for operandSupplier 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withOperandSupplier(RelRule.OperandTransform operandSupplier) {
      this.operandSupplier = Objects.requireNonNull(operandSupplier, "operandSupplier");
      return this;
    }

    /**
     * Initializes the value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#isSmart() smart} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#isSmart() smart}.</em>
     * @param smart The value for smart 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withSmart(boolean smart) {
      this.smart = smart;
      optBits |= OPT_BIT_SMART;
      return this;
    }

    /**
     * Initializes the value for the {@link FlinkFilterJoinRule.FlinkFilterIntoJoinRule.FlinkFilterIntoJoinRuleConfig#getPredicate() predicate} attribute.
     * @param predicate The value for predicate 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withPredicate(FlinkFilterJoinRule.Predicate predicate) {
      this.predicate = Objects.requireNonNull(predicate, "predicate");
      initBits &= ~INIT_BIT_PREDICATE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFlinkFilterIntoJoinRuleConfig ImmutableFlinkFilterIntoJoinRuleConfig}.
     * @return An immutable instance of FlinkFilterIntoJoinRuleConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFlinkFilterIntoJoinRuleConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFlinkFilterIntoJoinRuleConfig(this);
    }

    private boolean smartIsSet() {
      return (optBits & OPT_BIT_SMART) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PREDICATE) != 0) attributes.add("predicate");
      return "Cannot build FlinkFilterIntoJoinRuleConfig, some of required attributes are not set " + attributes;
    }
  }
}
