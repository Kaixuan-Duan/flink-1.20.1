package org.apache.flink.table.planner.plan.rules.logical;

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
 * {@code ImmutableUncollectToTableFunctionScanRule} contains immutable implementation classes generated from
 * abstract value types defined as nested inside {@link UncollectToTableFunctionScanRule}.
 * @see ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig
 */
@Generated(from = "UncollectToTableFunctionScanRule", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableUncollectToTableFunctionScanRule {
  private ImmutableUncollectToTableFunctionScanRule() {}

  /**
   * Immutable implementation of {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig}.
   * <p>
   * Use the builder to create immutable instances:
   * {@code ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.builder()}.
   */
  @Generated(from = "UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig", generator = "Immutables")
  @Immutable
  @CheckReturnValue
  public static final class UncollectToTableFunctionScanRuleConfig
      implements UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig {
    private final RelBuilderFactory relBuilderFactory;
    private final @Nullable String description;
    private final RelRule.OperandTransform operandSupplier;

    private UncollectToTableFunctionScanRuleConfig(ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.Builder builder) {
      this.description = builder.description;
      if (builder.relBuilderFactory != null) {
        initShim.relBuilderFactory(builder.relBuilderFactory);
      }
      if (builder.operandSupplier != null) {
        initShim.operandSupplier(builder.operandSupplier);
      }
      this.relBuilderFactory = initShim.relBuilderFactory();
      this.operandSupplier = initShim.operandSupplier();
      this.initShim = null;
    }

    private UncollectToTableFunctionScanRuleConfig(
        RelBuilderFactory relBuilderFactory,
        @Nullable String description,
        RelRule.OperandTransform operandSupplier) {
      this.relBuilderFactory = relBuilderFactory;
      this.description = description;
      this.operandSupplier = operandSupplier;
      this.initShim = null;
    }

    private static final byte STAGE_INITIALIZING = -1;
    private static final byte STAGE_UNINITIALIZED = 0;
    private static final byte STAGE_INITIALIZED = 1;
    @SuppressWarnings("Immutable")
    private transient volatile InitShim initShim = new InitShim();

    @Generated(from = "UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig", generator = "Immutables")
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

      void relBuilderFactory(RelBuilderFactory relBuilderFactory) {
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

      void operandSupplier(RelRule.OperandTransform operandSupplier) {
        this.operandSupplier = operandSupplier;
        operandSupplierBuildStage = STAGE_INITIALIZED;
      }

      private String formatInitCycleMessage() {
        List<String> attributes = new ArrayList<>();
        if (relBuilderFactoryBuildStage == STAGE_INITIALIZING) attributes.add("relBuilderFactory");
        if (operandSupplierBuildStage == STAGE_INITIALIZING) attributes.add("operandSupplier");
        return "Cannot build UncollectToTableFunctionScanRuleConfig, attribute initializers form cycle " + attributes;
      }
    }

    private RelBuilderFactory relBuilderFactoryInitialize() {
      return UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.super.relBuilderFactory();
    }

    private RelRule.OperandTransform operandSupplierInitialize() {
      return UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.super.operandSupplier();
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
     * Copy the current immutable object by setting a value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
     * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for relBuilderFactory
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig withRelBuilderFactory(RelBuilderFactory value) {
      if (this.relBuilderFactory == value) return this;
      RelBuilderFactory newValue = Objects.requireNonNull(value, "relBuilderFactory");
      return new ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig(newValue, this.description, this.operandSupplier);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#description() description} attribute.
     * An equals check used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for description (can be {@code null})
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig withDescription(@Nullable String value) {
      if (Objects.equals(this.description, value)) return this;
      return new ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig(this.relBuilderFactory, value, this.operandSupplier);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#operandSupplier() operandSupplier} attribute.
     * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for operandSupplier
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig withOperandSupplier(RelRule.OperandTransform value) {
      if (this.operandSupplier == value) return this;
      RelRule.OperandTransform newValue = Objects.requireNonNull(value, "operandSupplier");
      return new ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig(this.relBuilderFactory, this.description, newValue);
    }

    /**
     * This instance is equal to all instances of {@code UncollectToTableFunctionScanRuleConfig} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
      if (this == another) return true;
      return another instanceof ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig
          && equalTo((ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig) another);
    }

    private boolean equalTo(ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig another) {
      return relBuilderFactory.equals(another.relBuilderFactory)
          && Objects.equals(description, another.description)
          && operandSupplier.equals(another.operandSupplier);
    }

    /**
     * Computes a hash code from attributes: {@code relBuilderFactory}, {@code description}, {@code operandSupplier}.
     * @return hashCode value
     */
    @Override
    public int hashCode() {
      @Var int h = 5381;
      h += (h << 5) + relBuilderFactory.hashCode();
      h += (h << 5) + Objects.hashCode(description);
      h += (h << 5) + operandSupplier.hashCode();
      return h;
    }

    /**
     * Prints the immutable value {@code UncollectToTableFunctionScanRuleConfig} with attribute values.
     * @return A string representation of the value
     */
    @Override
    public String toString() {
      return MoreObjects.toStringHelper("UncollectToTableFunctionScanRuleConfig")
          .omitNullValues()
          .add("relBuilderFactory", relBuilderFactory)
          .add("description", description)
          .add("operandSupplier", operandSupplier)
          .toString();
    }

    /**
     * Creates an immutable copy of a {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig} value.
     * Uses accessors to get values to initialize the new immutable instance.
     * If an instance is already immutable, it is returned as is.
     * @param instance The instance to copy
     * @return A copied immutable UncollectToTableFunctionScanRuleConfig instance
     */
    public static ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig copyOf(UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig instance) {
      if (instance instanceof ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig) {
        return (ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig) instance;
      }
      return ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.builder()
          .from(instance)
          .build();
    }

    /**
     * Creates a builder for {@link ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig UncollectToTableFunctionScanRuleConfig}.
     * <pre>
     * ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.builder()
     *    .relBuilderFactory(org.apache.calcite.tools.RelBuilderFactory) // optional {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#relBuilderFactory() relBuilderFactory}
     *    .description(String | null) // nullable {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#description() description}
     *    .operandSupplier(org.apache.calcite.plan.RelRule.OperandTransform) // optional {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#operandSupplier() operandSupplier}
     *    .build();
     * </pre>
     * @return A new UncollectToTableFunctionScanRuleConfig builder
     */
    public static ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.Builder builder() {
      return new ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig.Builder();
    }

    /**
     * Builds instances of type {@link ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig UncollectToTableFunctionScanRuleConfig}.
     * Initialize attributes and then invoke the {@link #build()} method to create an
     * immutable instance.
     * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
     * but instead used immediately to create instances.</em>
     */
    @Generated(from = "UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig", generator = "Immutables")
    @NotThreadSafe
    public static final class Builder {
      private @Nullable RelBuilderFactory relBuilderFactory;
      private @Nullable String description;
      private @Nullable RelRule.OperandTransform operandSupplier;

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
       * Fill a builder with attribute values from the provided {@code org.apache.flink.table.planner.plan.rules.logical.UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig} instance.
       * @param instance The instance from which to copy values
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder from(UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig instance) {
        Objects.requireNonNull(instance, "instance");
        from((Object) instance);
        return this;
      }

      private void from(Object object) {
        if (object instanceof RelRule.Config) {
          RelRule.Config instance = (RelRule.Config) object;
          relBuilderFactory(instance.relBuilderFactory());
          operandSupplier(instance.operandSupplier());
          @Nullable String descriptionValue = instance.description();
          if (descriptionValue != null) {
            description(descriptionValue);
          }
        }
      }

      /**
       * Initializes the value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#relBuilderFactory() relBuilderFactory} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#relBuilderFactory() relBuilderFactory}.</em>
       * @param relBuilderFactory The value for relBuilderFactory 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder relBuilderFactory(RelBuilderFactory relBuilderFactory) {
        this.relBuilderFactory = Objects.requireNonNull(relBuilderFactory, "relBuilderFactory");
        return this;
      }

      /**
       * Initializes the value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#description() description} attribute.
       * @param description The value for description (can be {@code null})
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder description(@Nullable String description) {
        this.description = description;
        return this;
      }

      /**
       * Initializes the value for the {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#operandSupplier() operandSupplier} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig#operandSupplier() operandSupplier}.</em>
       * @param operandSupplier The value for operandSupplier 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder operandSupplier(RelRule.OperandTransform operandSupplier) {
        this.operandSupplier = Objects.requireNonNull(operandSupplier, "operandSupplier");
        return this;
      }

      /**
       * Builds a new {@link ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig UncollectToTableFunctionScanRuleConfig}.
       * @return An immutable instance of UncollectToTableFunctionScanRuleConfig
       * @throws java.lang.IllegalStateException if any required attributes are missing
       */
      public ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig build() {
        return new ImmutableUncollectToTableFunctionScanRule.UncollectToTableFunctionScanRuleConfig(this);
      }
    }
  }
}
