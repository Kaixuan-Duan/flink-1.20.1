package org.apache.calcite.tools;

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
import org.immutables.value.Generated;

/**
 * {@code ImmutableRelBuilder} contains immutable implementation classes generated from
 * abstract value types defined as nested inside {@link RelBuilder}.
 * @see ImmutableRelBuilder.Config
 */
@Generated(from = "RelBuilder", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
final class ImmutableRelBuilder {
  private ImmutableRelBuilder() {}

  /**
   * Immutable implementation of {@link RelBuilder.Config}.
   * <p>
   * Use the builder to create immutable instances:
   * {@code ImmutableRelBuilder.Config.builder()}.
   * Use the static factory method to get the default singleton instance:
   * {@code ImmutableRelBuilder.Config.of()}.
   */
  @Generated(from = "RelBuilder.Config", generator = "Immutables")
  @Immutable
  @CheckReturnValue
  static final class Config implements RelBuilder.Config {
    private final int bloat;
    private final boolean dedupAggregateCalls;
    private final boolean pruneInputOfAggregate;
    private final boolean pushJoinCondition;
    private final boolean simplify;
    private final boolean simplifyLimit;
    private final boolean simplifyValues;
    private final boolean aggregateUnique;

    private Config() {
      this.bloat = initShim.bloat();
      this.dedupAggregateCalls = initShim.dedupAggregateCalls();
      this.pruneInputOfAggregate = initShim.pruneInputOfAggregate();
      this.pushJoinCondition = initShim.pushJoinCondition();
      this.simplify = initShim.simplify();
      this.simplifyLimit = initShim.simplifyLimit();
      this.simplifyValues = initShim.simplifyValues();
      this.aggregateUnique = initShim.aggregateUnique();
      this.initShim = null;
    }

    private Config(ImmutableRelBuilder.Config.Builder builder) {
      if (builder.bloatIsSet()) {
        initShim.withBloat(builder.bloat);
      }
      if (builder.dedupAggregateCallsIsSet()) {
        initShim.withDedupAggregateCalls(builder.dedupAggregateCalls);
      }
      if (builder.pruneInputOfAggregateIsSet()) {
        initShim.withPruneInputOfAggregate(builder.pruneInputOfAggregate);
      }
      if (builder.pushJoinConditionIsSet()) {
        initShim.withPushJoinCondition(builder.pushJoinCondition);
      }
      if (builder.simplifyIsSet()) {
        initShim.withSimplify(builder.simplify);
      }
      if (builder.simplifyLimitIsSet()) {
        initShim.withSimplifyLimit(builder.simplifyLimit);
      }
      if (builder.simplifyValuesIsSet()) {
        initShim.withSimplifyValues(builder.simplifyValues);
      }
      if (builder.aggregateUniqueIsSet()) {
        initShim.withAggregateUnique(builder.aggregateUnique);
      }
      this.bloat = initShim.bloat();
      this.dedupAggregateCalls = initShim.dedupAggregateCalls();
      this.pruneInputOfAggregate = initShim.pruneInputOfAggregate();
      this.pushJoinCondition = initShim.pushJoinCondition();
      this.simplify = initShim.simplify();
      this.simplifyLimit = initShim.simplifyLimit();
      this.simplifyValues = initShim.simplifyValues();
      this.aggregateUnique = initShim.aggregateUnique();
      this.initShim = null;
    }

    private Config(
        int bloat,
        boolean dedupAggregateCalls,
        boolean pruneInputOfAggregate,
        boolean pushJoinCondition,
        boolean simplify,
        boolean simplifyLimit,
        boolean simplifyValues,
        boolean aggregateUnique) {
      this.bloat = bloat;
      this.dedupAggregateCalls = dedupAggregateCalls;
      this.pruneInputOfAggregate = pruneInputOfAggregate;
      this.pushJoinCondition = pushJoinCondition;
      this.simplify = simplify;
      this.simplifyLimit = simplifyLimit;
      this.simplifyValues = simplifyValues;
      this.aggregateUnique = aggregateUnique;
      this.initShim = null;
    }

    private static final byte STAGE_INITIALIZING = -1;
    private static final byte STAGE_UNINITIALIZED = 0;
    private static final byte STAGE_INITIALIZED = 1;
    @SuppressWarnings("Immutable")
    private transient volatile InitShim initShim = new InitShim();

    @Generated(from = "RelBuilder.Config", generator = "Immutables")
    private final class InitShim {
      private byte bloatBuildStage = STAGE_UNINITIALIZED;
      private int bloat;

      int bloat() {
        if (bloatBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (bloatBuildStage == STAGE_UNINITIALIZED) {
          bloatBuildStage = STAGE_INITIALIZING;
          this.bloat = bloatInitialize();
          bloatBuildStage = STAGE_INITIALIZED;
        }
        return this.bloat;
      }

      void withBloat(int bloat) {
        this.bloat = bloat;
        bloatBuildStage = STAGE_INITIALIZED;
      }

      private byte dedupAggregateCallsBuildStage = STAGE_UNINITIALIZED;
      private boolean dedupAggregateCalls;

      boolean dedupAggregateCalls() {
        if (dedupAggregateCallsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (dedupAggregateCallsBuildStage == STAGE_UNINITIALIZED) {
          dedupAggregateCallsBuildStage = STAGE_INITIALIZING;
          this.dedupAggregateCalls = dedupAggregateCallsInitialize();
          dedupAggregateCallsBuildStage = STAGE_INITIALIZED;
        }
        return this.dedupAggregateCalls;
      }

      void withDedupAggregateCalls(boolean dedupAggregateCalls) {
        this.dedupAggregateCalls = dedupAggregateCalls;
        dedupAggregateCallsBuildStage = STAGE_INITIALIZED;
      }

      private byte pruneInputOfAggregateBuildStage = STAGE_UNINITIALIZED;
      private boolean pruneInputOfAggregate;

      boolean pruneInputOfAggregate() {
        if (pruneInputOfAggregateBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (pruneInputOfAggregateBuildStage == STAGE_UNINITIALIZED) {
          pruneInputOfAggregateBuildStage = STAGE_INITIALIZING;
          this.pruneInputOfAggregate = pruneInputOfAggregateInitialize();
          pruneInputOfAggregateBuildStage = STAGE_INITIALIZED;
        }
        return this.pruneInputOfAggregate;
      }

      void withPruneInputOfAggregate(boolean pruneInputOfAggregate) {
        this.pruneInputOfAggregate = pruneInputOfAggregate;
        pruneInputOfAggregateBuildStage = STAGE_INITIALIZED;
      }

      private byte pushJoinConditionBuildStage = STAGE_UNINITIALIZED;
      private boolean pushJoinCondition;

      boolean pushJoinCondition() {
        if (pushJoinConditionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (pushJoinConditionBuildStage == STAGE_UNINITIALIZED) {
          pushJoinConditionBuildStage = STAGE_INITIALIZING;
          this.pushJoinCondition = pushJoinConditionInitialize();
          pushJoinConditionBuildStage = STAGE_INITIALIZED;
        }
        return this.pushJoinCondition;
      }

      void withPushJoinCondition(boolean pushJoinCondition) {
        this.pushJoinCondition = pushJoinCondition;
        pushJoinConditionBuildStage = STAGE_INITIALIZED;
      }

      private byte simplifyBuildStage = STAGE_UNINITIALIZED;
      private boolean simplify;

      boolean simplify() {
        if (simplifyBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (simplifyBuildStage == STAGE_UNINITIALIZED) {
          simplifyBuildStage = STAGE_INITIALIZING;
          this.simplify = simplifyInitialize();
          simplifyBuildStage = STAGE_INITIALIZED;
        }
        return this.simplify;
      }

      void withSimplify(boolean simplify) {
        this.simplify = simplify;
        simplifyBuildStage = STAGE_INITIALIZED;
      }

      private byte simplifyLimitBuildStage = STAGE_UNINITIALIZED;
      private boolean simplifyLimit;

      boolean simplifyLimit() {
        if (simplifyLimitBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (simplifyLimitBuildStage == STAGE_UNINITIALIZED) {
          simplifyLimitBuildStage = STAGE_INITIALIZING;
          this.simplifyLimit = simplifyLimitInitialize();
          simplifyLimitBuildStage = STAGE_INITIALIZED;
        }
        return this.simplifyLimit;
      }

      void withSimplifyLimit(boolean simplifyLimit) {
        this.simplifyLimit = simplifyLimit;
        simplifyLimitBuildStage = STAGE_INITIALIZED;
      }

      private byte simplifyValuesBuildStage = STAGE_UNINITIALIZED;
      private boolean simplifyValues;

      boolean simplifyValues() {
        if (simplifyValuesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (simplifyValuesBuildStage == STAGE_UNINITIALIZED) {
          simplifyValuesBuildStage = STAGE_INITIALIZING;
          this.simplifyValues = simplifyValuesInitialize();
          simplifyValuesBuildStage = STAGE_INITIALIZED;
        }
        return this.simplifyValues;
      }

      void withSimplifyValues(boolean simplifyValues) {
        this.simplifyValues = simplifyValues;
        simplifyValuesBuildStage = STAGE_INITIALIZED;
      }

      private byte aggregateUniqueBuildStage = STAGE_UNINITIALIZED;
      private boolean aggregateUnique;

      boolean aggregateUnique() {
        if (aggregateUniqueBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (aggregateUniqueBuildStage == STAGE_UNINITIALIZED) {
          aggregateUniqueBuildStage = STAGE_INITIALIZING;
          this.aggregateUnique = aggregateUniqueInitialize();
          aggregateUniqueBuildStage = STAGE_INITIALIZED;
        }
        return this.aggregateUnique;
      }

      void withAggregateUnique(boolean aggregateUnique) {
        this.aggregateUnique = aggregateUnique;
        aggregateUniqueBuildStage = STAGE_INITIALIZED;
      }

      private String formatInitCycleMessage() {
        List<String> attributes = new ArrayList<>();
        if (bloatBuildStage == STAGE_INITIALIZING) attributes.add("bloat");
        if (dedupAggregateCallsBuildStage == STAGE_INITIALIZING) attributes.add("dedupAggregateCalls");
        if (pruneInputOfAggregateBuildStage == STAGE_INITIALIZING) attributes.add("pruneInputOfAggregate");
        if (pushJoinConditionBuildStage == STAGE_INITIALIZING) attributes.add("pushJoinCondition");
        if (simplifyBuildStage == STAGE_INITIALIZING) attributes.add("simplify");
        if (simplifyLimitBuildStage == STAGE_INITIALIZING) attributes.add("simplifyLimit");
        if (simplifyValuesBuildStage == STAGE_INITIALIZING) attributes.add("simplifyValues");
        if (aggregateUniqueBuildStage == STAGE_INITIALIZING) attributes.add("aggregateUnique");
        return "Cannot build Config, attribute initializers form cycle " + attributes;
      }
    }

    private int bloatInitialize() {
      return RelBuilder.Config.super.bloat();
    }

    private boolean dedupAggregateCallsInitialize() {
      return RelBuilder.Config.super.dedupAggregateCalls();
    }

    private boolean pruneInputOfAggregateInitialize() {
      return RelBuilder.Config.super.pruneInputOfAggregate();
    }

    private boolean pushJoinConditionInitialize() {
      return RelBuilder.Config.super.pushJoinCondition();
    }

    private boolean simplifyInitialize() {
      return RelBuilder.Config.super.simplify();
    }

    private boolean simplifyLimitInitialize() {
      return RelBuilder.Config.super.simplifyLimit();
    }

    private boolean simplifyValuesInitialize() {
      return RelBuilder.Config.super.simplifyValues();
    }

    private boolean aggregateUniqueInitialize() {
      return RelBuilder.Config.super.aggregateUnique();
    }

    /**
     * @return The value of the {@code bloat} attribute
     */
    @Override
    public int bloat() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.bloat()
          : this.bloat;
    }

    /**
     * @return The value of the {@code dedupAggregateCalls} attribute
     */
    @Override
    public boolean dedupAggregateCalls() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.dedupAggregateCalls()
          : this.dedupAggregateCalls;
    }

    /**
     * @return The value of the {@code pruneInputOfAggregate} attribute
     */
    @Override
    public boolean pruneInputOfAggregate() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.pruneInputOfAggregate()
          : this.pruneInputOfAggregate;
    }

    /**
     * @return The value of the {@code pushJoinCondition} attribute
     */
    @Override
    public boolean pushJoinCondition() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.pushJoinCondition()
          : this.pushJoinCondition;
    }

    /**
     * @return The value of the {@code simplify} attribute
     */
    @Override
    public boolean simplify() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.simplify()
          : this.simplify;
    }

    /**
     * @return The value of the {@code simplifyLimit} attribute
     */
    @Override
    public boolean simplifyLimit() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.simplifyLimit()
          : this.simplifyLimit;
    }

    /**
     * @return The value of the {@code simplifyValues} attribute
     */
    @Override
    public boolean simplifyValues() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.simplifyValues()
          : this.simplifyValues;
    }

    /**
     * @return The value of the {@code aggregateUnique} attribute
     */
    @Override
    public boolean aggregateUnique() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.aggregateUnique()
          : this.aggregateUnique;
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#bloat() bloat} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for bloat
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withBloat(int value) {
      if (this.bloat == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          value,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          this.simplify,
          this.simplifyLimit,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#dedupAggregateCalls() dedupAggregateCalls} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for dedupAggregateCalls
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withDedupAggregateCalls(boolean value) {
      if (this.dedupAggregateCalls == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          value,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          this.simplify,
          this.simplifyLimit,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#pruneInputOfAggregate() pruneInputOfAggregate} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for pruneInputOfAggregate
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withPruneInputOfAggregate(boolean value) {
      if (this.pruneInputOfAggregate == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          value,
          this.pushJoinCondition,
          this.simplify,
          this.simplifyLimit,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#pushJoinCondition() pushJoinCondition} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for pushJoinCondition
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withPushJoinCondition(boolean value) {
      if (this.pushJoinCondition == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          value,
          this.simplify,
          this.simplifyLimit,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#simplify() simplify} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for simplify
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withSimplify(boolean value) {
      if (this.simplify == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          value,
          this.simplifyLimit,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#simplifyLimit() simplifyLimit} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for simplifyLimit
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withSimplifyLimit(boolean value) {
      if (this.simplifyLimit == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          this.simplify,
          value,
          this.simplifyValues,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#simplifyValues() simplifyValues} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for simplifyValues
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withSimplifyValues(boolean value) {
      if (this.simplifyValues == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          this.simplify,
          this.simplifyLimit,
          value,
          this.aggregateUnique));
    }

    /**
     * Copy the current immutable object by setting a value for the {@link RelBuilder.Config#aggregateUnique() aggregateUnique} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for aggregateUnique
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableRelBuilder.Config withAggregateUnique(boolean value) {
      if (this.aggregateUnique == value) return this;
      return validate(new ImmutableRelBuilder.Config(
          this.bloat,
          this.dedupAggregateCalls,
          this.pruneInputOfAggregate,
          this.pushJoinCondition,
          this.simplify,
          this.simplifyLimit,
          this.simplifyValues,
          value));
    }

    /**
     * This instance is equal to all instances of {@code Config} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
      if (this == another) return true;
      return another instanceof ImmutableRelBuilder.Config
          && equalTo((ImmutableRelBuilder.Config) another);
    }

    private boolean equalTo(ImmutableRelBuilder.Config another) {
      return bloat == another.bloat
          && dedupAggregateCalls == another.dedupAggregateCalls
          && pruneInputOfAggregate == another.pruneInputOfAggregate
          && pushJoinCondition == another.pushJoinCondition
          && simplify == another.simplify
          && simplifyLimit == another.simplifyLimit
          && simplifyValues == another.simplifyValues
          && aggregateUnique == another.aggregateUnique;
    }

    /**
     * Computes a hash code from attributes: {@code bloat}, {@code dedupAggregateCalls}, {@code pruneInputOfAggregate}, {@code pushJoinCondition}, {@code simplify}, {@code simplifyLimit}, {@code simplifyValues}, {@code aggregateUnique}.
     * @return hashCode value
     */
    @Override
    public int hashCode() {
      @Var int h = 5381;
      h += (h << 5) + bloat;
      h += (h << 5) + Booleans.hashCode(dedupAggregateCalls);
      h += (h << 5) + Booleans.hashCode(pruneInputOfAggregate);
      h += (h << 5) + Booleans.hashCode(pushJoinCondition);
      h += (h << 5) + Booleans.hashCode(simplify);
      h += (h << 5) + Booleans.hashCode(simplifyLimit);
      h += (h << 5) + Booleans.hashCode(simplifyValues);
      h += (h << 5) + Booleans.hashCode(aggregateUnique);
      return h;
    }

    /**
     * Prints the immutable value {@code Config} with attribute values.
     * @return A string representation of the value
     */
    @Override
    public String toString() {
      return MoreObjects.toStringHelper("Config")
          .omitNullValues()
          .add("bloat", bloat)
          .add("dedupAggregateCalls", dedupAggregateCalls)
          .add("pruneInputOfAggregate", pruneInputOfAggregate)
          .add("pushJoinCondition", pushJoinCondition)
          .add("simplify", simplify)
          .add("simplifyLimit", simplifyLimit)
          .add("simplifyValues", simplifyValues)
          .add("aggregateUnique", aggregateUnique)
          .toString();
    }

    private static final ImmutableRelBuilder.Config INSTANCE = validate(new ImmutableRelBuilder.Config());

    /**
     * Returns the default immutable singleton value of {@code Config}
     * @return An immutable instance of Config
     */
    public static ImmutableRelBuilder.Config of() {
      return INSTANCE;
    }

    private static ImmutableRelBuilder.Config validate(ImmutableRelBuilder.Config instance) {
      return INSTANCE != null && INSTANCE.equalTo(instance) ? INSTANCE : instance;
    }

    /**
     * Creates an immutable copy of a {@link RelBuilder.Config} value.
     * Uses accessors to get values to initialize the new immutable instance.
     * If an instance is already immutable, it is returned as is.
     * @param instance The instance to copy
     * @return A copied immutable Config instance
     */
    public static ImmutableRelBuilder.Config copyOf(RelBuilder.Config instance) {
      if (instance instanceof ImmutableRelBuilder.Config) {
        return (ImmutableRelBuilder.Config) instance;
      }
      return ImmutableRelBuilder.Config.builder()
          .from(instance)
          .build();
    }

    /**
     * Creates a builder for {@link ImmutableRelBuilder.Config Config}.
     * <pre>
     * ImmutableRelBuilder.Config.builder()
     *    .withBloat(int) // optional {@link RelBuilder.Config#bloat() bloat}
     *    .withDedupAggregateCalls(boolean) // optional {@link RelBuilder.Config#dedupAggregateCalls() dedupAggregateCalls}
     *    .withPruneInputOfAggregate(boolean) // optional {@link RelBuilder.Config#pruneInputOfAggregate() pruneInputOfAggregate}
     *    .withPushJoinCondition(boolean) // optional {@link RelBuilder.Config#pushJoinCondition() pushJoinCondition}
     *    .withSimplify(boolean) // optional {@link RelBuilder.Config#simplify() simplify}
     *    .withSimplifyLimit(boolean) // optional {@link RelBuilder.Config#simplifyLimit() simplifyLimit}
     *    .withSimplifyValues(boolean) // optional {@link RelBuilder.Config#simplifyValues() simplifyValues}
     *    .withAggregateUnique(boolean) // optional {@link RelBuilder.Config#aggregateUnique() aggregateUnique}
     *    .build();
     * </pre>
     * @return A new Config builder
     */
    public static ImmutableRelBuilder.Config.Builder builder() {
      return new ImmutableRelBuilder.Config.Builder();
    }

    /**
     * Builds instances of type {@link ImmutableRelBuilder.Config Config}.
     * Initialize attributes and then invoke the {@link #build()} method to create an
     * immutable instance.
     * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
     * but instead used immediately to create instances.</em>
     */
    @Generated(from = "RelBuilder.Config", generator = "Immutables")
    @NotThreadSafe
    public static final class Builder {
      private static final long OPT_BIT_BLOAT = 0x1L;
      private static final long OPT_BIT_DEDUP_AGGREGATE_CALLS = 0x2L;
      private static final long OPT_BIT_PRUNE_INPUT_OF_AGGREGATE = 0x4L;
      private static final long OPT_BIT_PUSH_JOIN_CONDITION = 0x8L;
      private static final long OPT_BIT_SIMPLIFY = 0x10L;
      private static final long OPT_BIT_SIMPLIFY_LIMIT = 0x20L;
      private static final long OPT_BIT_SIMPLIFY_VALUES = 0x40L;
      private static final long OPT_BIT_AGGREGATE_UNIQUE = 0x80L;
      private long optBits;

      private int bloat;
      private boolean dedupAggregateCalls;
      private boolean pruneInputOfAggregate;
      private boolean pushJoinCondition;
      private boolean simplify;
      private boolean simplifyLimit;
      private boolean simplifyValues;
      private boolean aggregateUnique;

      private Builder() {
      }

      /**
       * Fill a builder with attribute values from the provided {@code Config} instance.
       * Regular attribute values will be replaced with those from the given instance.
       * Absent optional values will not replace present values.
       * @param instance The instance from which to copy values
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder from(RelBuilder.Config instance) {
        Objects.requireNonNull(instance, "instance");
        withBloat(instance.bloat());
        withDedupAggregateCalls(instance.dedupAggregateCalls());
        withPruneInputOfAggregate(instance.pruneInputOfAggregate());
        withPushJoinCondition(instance.pushJoinCondition());
        withSimplify(instance.simplify());
        withSimplifyLimit(instance.simplifyLimit());
        withSimplifyValues(instance.simplifyValues());
        withAggregateUnique(instance.aggregateUnique());
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#bloat() bloat} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#bloat() bloat}.</em>
       * @param bloat The value for bloat 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withBloat(int bloat) {
        this.bloat = bloat;
        optBits |= OPT_BIT_BLOAT;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#dedupAggregateCalls() dedupAggregateCalls} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#dedupAggregateCalls() dedupAggregateCalls}.</em>
       * @param dedupAggregateCalls The value for dedupAggregateCalls 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withDedupAggregateCalls(boolean dedupAggregateCalls) {
        this.dedupAggregateCalls = dedupAggregateCalls;
        optBits |= OPT_BIT_DEDUP_AGGREGATE_CALLS;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#pruneInputOfAggregate() pruneInputOfAggregate} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#pruneInputOfAggregate() pruneInputOfAggregate}.</em>
       * @param pruneInputOfAggregate The value for pruneInputOfAggregate 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withPruneInputOfAggregate(boolean pruneInputOfAggregate) {
        this.pruneInputOfAggregate = pruneInputOfAggregate;
        optBits |= OPT_BIT_PRUNE_INPUT_OF_AGGREGATE;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#pushJoinCondition() pushJoinCondition} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#pushJoinCondition() pushJoinCondition}.</em>
       * @param pushJoinCondition The value for pushJoinCondition 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withPushJoinCondition(boolean pushJoinCondition) {
        this.pushJoinCondition = pushJoinCondition;
        optBits |= OPT_BIT_PUSH_JOIN_CONDITION;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#simplify() simplify} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#simplify() simplify}.</em>
       * @param simplify The value for simplify 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withSimplify(boolean simplify) {
        this.simplify = simplify;
        optBits |= OPT_BIT_SIMPLIFY;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#simplifyLimit() simplifyLimit} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#simplifyLimit() simplifyLimit}.</em>
       * @param simplifyLimit The value for simplifyLimit 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withSimplifyLimit(boolean simplifyLimit) {
        this.simplifyLimit = simplifyLimit;
        optBits |= OPT_BIT_SIMPLIFY_LIMIT;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#simplifyValues() simplifyValues} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#simplifyValues() simplifyValues}.</em>
       * @param simplifyValues The value for simplifyValues 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withSimplifyValues(boolean simplifyValues) {
        this.simplifyValues = simplifyValues;
        optBits |= OPT_BIT_SIMPLIFY_VALUES;
        return this;
      }

      /**
       * Initializes the value for the {@link RelBuilder.Config#aggregateUnique() aggregateUnique} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RelBuilder.Config#aggregateUnique() aggregateUnique}.</em>
       * @param aggregateUnique The value for aggregateUnique 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withAggregateUnique(boolean aggregateUnique) {
        this.aggregateUnique = aggregateUnique;
        optBits |= OPT_BIT_AGGREGATE_UNIQUE;
        return this;
      }

      /**
       * Builds a new {@link ImmutableRelBuilder.Config Config}.
       * @return An immutable instance of Config
       * @throws java.lang.IllegalStateException if any required attributes are missing
       */
      public ImmutableRelBuilder.Config build() {
        return ImmutableRelBuilder.Config.validate(new ImmutableRelBuilder.Config(this));
      }

      private boolean bloatIsSet() {
        return (optBits & OPT_BIT_BLOAT) != 0;
      }

      private boolean dedupAggregateCallsIsSet() {
        return (optBits & OPT_BIT_DEDUP_AGGREGATE_CALLS) != 0;
      }

      private boolean pruneInputOfAggregateIsSet() {
        return (optBits & OPT_BIT_PRUNE_INPUT_OF_AGGREGATE) != 0;
      }

      private boolean pushJoinConditionIsSet() {
        return (optBits & OPT_BIT_PUSH_JOIN_CONDITION) != 0;
      }

      private boolean simplifyIsSet() {
        return (optBits & OPT_BIT_SIMPLIFY) != 0;
      }

      private boolean simplifyLimitIsSet() {
        return (optBits & OPT_BIT_SIMPLIFY_LIMIT) != 0;
      }

      private boolean simplifyValuesIsSet() {
        return (optBits & OPT_BIT_SIMPLIFY_VALUES) != 0;
      }

      private boolean aggregateUniqueIsSet() {
        return (optBits & OPT_BIT_AGGREGATE_UNIQUE) != 0;
      }
    }
  }
}
