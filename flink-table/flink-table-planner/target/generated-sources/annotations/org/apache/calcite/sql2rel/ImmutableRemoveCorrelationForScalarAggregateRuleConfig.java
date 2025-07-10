package org.apache.calcite.sql2rel;

import com.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRemoveCorrelationForScalarAggregateRuleConfig.builder()}.
 */
@Generated(from = "RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
final class ImmutableRemoveCorrelationForScalarAggregateRuleConfig
    implements RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig {
  private final RelBuilderFactory relBuilderFactory;
  private final @Nullable String description;
  private final RelRule.OperandTransform operandSupplier;
  private final RelDecorrelator decorrelator;

  private ImmutableRemoveCorrelationForScalarAggregateRuleConfig(ImmutableRemoveCorrelationForScalarAggregateRuleConfig.Builder builder) {
    this.description = builder.description;
    this.decorrelator = builder.decorrelator;
    if (builder.relBuilderFactory != null) {
      initShim.withRelBuilderFactory(builder.relBuilderFactory);
    }
    if (builder.operandSupplier != null) {
      initShim.withOperandSupplier(builder.operandSupplier);
    }
    this.relBuilderFactory = initShim.relBuilderFactory();
    this.operandSupplier = initShim.operandSupplier();
    this.initShim = null;
  }

  private ImmutableRemoveCorrelationForScalarAggregateRuleConfig(
      RelBuilderFactory relBuilderFactory,
      @Nullable String description,
      RelRule.OperandTransform operandSupplier,
      RelDecorrelator decorrelator) {
    this.relBuilderFactory = relBuilderFactory;
    this.description = description;
    this.operandSupplier = operandSupplier;
    this.decorrelator = decorrelator;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig", generator = "Immutables")
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

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (relBuilderFactoryBuildStage == STAGE_INITIALIZING) attributes.add("relBuilderFactory");
      if (operandSupplierBuildStage == STAGE_INITIALIZING) attributes.add("operandSupplier");
      return "Cannot build RemoveCorrelationForScalarAggregateRuleConfig, attribute initializers form cycle " + attributes;
    }
  }

  private RelBuilderFactory relBuilderFactoryInitialize() {
    return RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig.super.relBuilderFactory();
  }

  private RelRule.OperandTransform operandSupplierInitialize() {
    return RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig.super.operandSupplier();
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
   * @return The value of the {@code decorrelator} attribute
   */
  @Override
  public RelDecorrelator decorrelator() {
    return decorrelator;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relBuilderFactory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveCorrelationForScalarAggregateRuleConfig withRelBuilderFactory(RelBuilderFactory value) {
    if (this.relBuilderFactory == value) return this;
    RelBuilderFactory newValue = Objects.requireNonNull(value, "relBuilderFactory");
    return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig(newValue, this.description, this.operandSupplier, this.decorrelator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveCorrelationForScalarAggregateRuleConfig withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig(this.relBuilderFactory, value, this.operandSupplier, this.decorrelator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#operandSupplier() operandSupplier} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operandSupplier
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveCorrelationForScalarAggregateRuleConfig withOperandSupplier(RelRule.OperandTransform value) {
    if (this.operandSupplier == value) return this;
    RelRule.OperandTransform newValue = Objects.requireNonNull(value, "operandSupplier");
    return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig(this.relBuilderFactory, this.description, newValue, this.decorrelator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#decorrelator() decorrelator} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for decorrelator
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRemoveCorrelationForScalarAggregateRuleConfig withDecorrelator(RelDecorrelator value) {
    if (this.decorrelator == value) return this;
    RelDecorrelator newValue = Objects.requireNonNull(value, "decorrelator");
    return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig(this.relBuilderFactory, this.description, this.operandSupplier, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRemoveCorrelationForScalarAggregateRuleConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRemoveCorrelationForScalarAggregateRuleConfig
        && equalTo((ImmutableRemoveCorrelationForScalarAggregateRuleConfig) another);
  }

  private boolean equalTo(ImmutableRemoveCorrelationForScalarAggregateRuleConfig another) {
    return relBuilderFactory.equals(another.relBuilderFactory)
        && Objects.equals(description, another.description)
        && operandSupplier.equals(another.operandSupplier)
        && decorrelator.equals(another.decorrelator);
  }

  /**
   * Computes a hash code from attributes: {@code relBuilderFactory}, {@code description}, {@code operandSupplier}, {@code decorrelator}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + relBuilderFactory.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + operandSupplier.hashCode();
    h += (h << 5) + decorrelator.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RemoveCorrelationForScalarAggregateRuleConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RemoveCorrelationForScalarAggregateRuleConfig")
        .omitNullValues()
        .add("relBuilderFactory", relBuilderFactory)
        .add("description", description)
        .add("operandSupplier", operandSupplier)
        .add("decorrelator", decorrelator)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RemoveCorrelationForScalarAggregateRuleConfig instance
   */
  public static ImmutableRemoveCorrelationForScalarAggregateRuleConfig copyOf(RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig instance) {
    if (instance instanceof ImmutableRemoveCorrelationForScalarAggregateRuleConfig) {
      return (ImmutableRemoveCorrelationForScalarAggregateRuleConfig) instance;
    }
    return ImmutableRemoveCorrelationForScalarAggregateRuleConfig.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRemoveCorrelationForScalarAggregateRuleConfig ImmutableRemoveCorrelationForScalarAggregateRuleConfig}.
   * <pre>
   * ImmutableRemoveCorrelationForScalarAggregateRuleConfig.builder()
   *    .withRelBuilderFactory(org.apache.calcite.tools.RelBuilderFactory) // optional {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#relBuilderFactory() relBuilderFactory}
   *    .withDescription(String | null) // nullable {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#description() description}
   *    .withOperandSupplier(org.apache.calcite.plan.RelRule.OperandTransform) // optional {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#operandSupplier() operandSupplier}
   *    .withDecorrelator(org.apache.calcite.sql2rel.RelDecorrelator) // required {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#decorrelator() decorrelator}
   *    .build();
   * </pre>
   * @return A new ImmutableRemoveCorrelationForScalarAggregateRuleConfig builder
   */
  public static ImmutableRemoveCorrelationForScalarAggregateRuleConfig.Builder builder() {
    return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRemoveCorrelationForScalarAggregateRuleConfig ImmutableRemoveCorrelationForScalarAggregateRuleConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DECORRELATOR = 0x1L;
    private long initBits = 0x1L;

    private @Nullable RelBuilderFactory relBuilderFactory;
    private @Nullable String description;
    private @Nullable RelRule.OperandTransform operandSupplier;
    private @Nullable RelDecorrelator decorrelator;

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
     * Fill a builder with attribute values from the provided {@code org.apache.calcite.sql2rel.RelDecorrelator.Config} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RelDecorrelator.Config instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.apache.calcite.sql2rel.RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig instance) {
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
      if (object instanceof RelDecorrelator.Config) {
        RelDecorrelator.Config instance = (RelDecorrelator.Config) object;
        withDecorrelator(instance.decorrelator());
      }
    }

    /**
     * Initializes the value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#relBuilderFactory() relBuilderFactory}.</em>
     * @param relBuilderFactory The value for relBuilderFactory 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withRelBuilderFactory(RelBuilderFactory relBuilderFactory) {
      this.relBuilderFactory = Objects.requireNonNull(relBuilderFactory, "relBuilderFactory");
      return this;
    }

    /**
     * Initializes the value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withDescription(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#operandSupplier() operandSupplier} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#operandSupplier() operandSupplier}.</em>
     * @param operandSupplier The value for operandSupplier 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withOperandSupplier(RelRule.OperandTransform operandSupplier) {
      this.operandSupplier = Objects.requireNonNull(operandSupplier, "operandSupplier");
      return this;
    }

    /**
     * Initializes the value for the {@link RelDecorrelator.RemoveCorrelationForScalarAggregateRule.RemoveCorrelationForScalarAggregateRuleConfig#decorrelator() decorrelator} attribute.
     * @param decorrelator The value for decorrelator 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder withDecorrelator(RelDecorrelator decorrelator) {
      this.decorrelator = Objects.requireNonNull(decorrelator, "decorrelator");
      initBits &= ~INIT_BIT_DECORRELATOR;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRemoveCorrelationForScalarAggregateRuleConfig ImmutableRemoveCorrelationForScalarAggregateRuleConfig}.
     * @return An immutable instance of RemoveCorrelationForScalarAggregateRuleConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRemoveCorrelationForScalarAggregateRuleConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRemoveCorrelationForScalarAggregateRuleConfig(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_DECORRELATOR) != 0) attributes.add("decorrelator");
      return "Cannot build RemoveCorrelationForScalarAggregateRuleConfig, some of required attributes are not set " + attributes;
    }
  }
}
