package org.apache.calcite.sql2rel;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.apache.calcite.rel.hint.HintStrategyTable;
import org.apache.calcite.tools.RelBuilder;
import org.apache.calcite.tools.RelBuilderFactory;
import org.immutables.value.Generated;

/**
 * {@code ImmutableSqlToRelConverter} contains immutable implementation classes generated from
 * abstract value types defined as nested inside {@link SqlToRelConverter}.
 * @see ImmutableSqlToRelConverter.Config
 */
@Generated(from = "SqlToRelConverter", generator = "Immutables")
@SuppressWarnings({"UnstableApiUsage", "all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
final class ImmutableSqlToRelConverter {
  private ImmutableSqlToRelConverter() {}

  /**
   * Immutable implementation of {@link SqlToRelConverter.Config}.
   * <p>
   * Use the builder to create immutable instances:
   * {@code ImmutableSqlToRelConverter.Config.builder()}.
   */
  @Generated(from = "SqlToRelConverter.Config", generator = "Immutables")
  @Immutable
  @CheckReturnValue
  static final class Config implements SqlToRelConverter.Config {
    private final boolean decorrelationEnabled;
    private final boolean trimUnusedFields;
    private final boolean createValuesRel;
    private final boolean explain;
    private final boolean expand;
    private final int inSubQueryThreshold;
    private final boolean removeSortInSubQuery;
    private final RelBuilderFactory relBuilderFactory;
    private final UnaryOperator<RelBuilder.Config> relBuilderConfigTransform;
    private final HintStrategyTable hintStrategyTable;
    private final boolean addJsonTypeOperatorEnabled;

    private Config(ImmutableSqlToRelConverter.Config.Builder builder) {
      this.relBuilderFactory = builder.relBuilderFactory;
      this.relBuilderConfigTransform = builder.relBuilderConfigTransform;
      this.hintStrategyTable = builder.hintStrategyTable;
      if (builder.decorrelationEnabledIsSet()) {
        initShim.withDecorrelationEnabled(builder.decorrelationEnabled);
      }
      if (builder.trimUnusedFieldsIsSet()) {
        initShim.withTrimUnusedFields(builder.trimUnusedFields);
      }
      if (builder.createValuesRelIsSet()) {
        initShim.withCreateValuesRel(builder.createValuesRel);
      }
      if (builder.explainIsSet()) {
        initShim.withExplain(builder.explain);
      }
      if (builder.expandIsSet()) {
        initShim.withExpand(builder.expand);
      }
      if (builder.inSubQueryThresholdIsSet()) {
        initShim.withInSubQueryThreshold(builder.inSubQueryThreshold);
      }
      if (builder.removeSortInSubQueryIsSet()) {
        initShim.withRemoveSortInSubQuery(builder.removeSortInSubQuery);
      }
      if (builder.addJsonTypeOperatorEnabledIsSet()) {
        initShim.withAddJsonTypeOperatorEnabled(builder.addJsonTypeOperatorEnabled);
      }
      this.decorrelationEnabled = initShim.isDecorrelationEnabled();
      this.trimUnusedFields = initShim.isTrimUnusedFields();
      this.createValuesRel = initShim.isCreateValuesRel();
      this.explain = initShim.isExplain();
      this.expand = initShim.isExpand();
      this.inSubQueryThreshold = initShim.getInSubQueryThreshold();
      this.removeSortInSubQuery = initShim.isRemoveSortInSubQuery();
      this.addJsonTypeOperatorEnabled = initShim.isAddJsonTypeOperatorEnabled();
      this.initShim = null;
    }

    private Config(
        boolean decorrelationEnabled,
        boolean trimUnusedFields,
        boolean createValuesRel,
        boolean explain,
        boolean expand,
        int inSubQueryThreshold,
        boolean removeSortInSubQuery,
        RelBuilderFactory relBuilderFactory,
        UnaryOperator<RelBuilder.Config> relBuilderConfigTransform,
        HintStrategyTable hintStrategyTable,
        boolean addJsonTypeOperatorEnabled) {
      this.decorrelationEnabled = decorrelationEnabled;
      this.trimUnusedFields = trimUnusedFields;
      this.createValuesRel = createValuesRel;
      this.explain = explain;
      this.expand = expand;
      this.inSubQueryThreshold = inSubQueryThreshold;
      this.removeSortInSubQuery = removeSortInSubQuery;
      this.relBuilderFactory = relBuilderFactory;
      this.relBuilderConfigTransform = relBuilderConfigTransform;
      this.hintStrategyTable = hintStrategyTable;
      this.addJsonTypeOperatorEnabled = addJsonTypeOperatorEnabled;
      this.initShim = null;
    }

    private static final byte STAGE_INITIALIZING = -1;
    private static final byte STAGE_UNINITIALIZED = 0;
    private static final byte STAGE_INITIALIZED = 1;
    @SuppressWarnings("Immutable")
    private transient volatile InitShim initShim = new InitShim();

    @Generated(from = "SqlToRelConverter.Config", generator = "Immutables")
    private final class InitShim {
      private byte decorrelationEnabledBuildStage = STAGE_UNINITIALIZED;
      private boolean decorrelationEnabled;

      boolean isDecorrelationEnabled() {
        if (decorrelationEnabledBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (decorrelationEnabledBuildStage == STAGE_UNINITIALIZED) {
          decorrelationEnabledBuildStage = STAGE_INITIALIZING;
          this.decorrelationEnabled = isDecorrelationEnabledInitialize();
          decorrelationEnabledBuildStage = STAGE_INITIALIZED;
        }
        return this.decorrelationEnabled;
      }

      void withDecorrelationEnabled(boolean decorrelationEnabled) {
        this.decorrelationEnabled = decorrelationEnabled;
        decorrelationEnabledBuildStage = STAGE_INITIALIZED;
      }

      private byte trimUnusedFieldsBuildStage = STAGE_UNINITIALIZED;
      private boolean trimUnusedFields;

      boolean isTrimUnusedFields() {
        if (trimUnusedFieldsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (trimUnusedFieldsBuildStage == STAGE_UNINITIALIZED) {
          trimUnusedFieldsBuildStage = STAGE_INITIALIZING;
          this.trimUnusedFields = isTrimUnusedFieldsInitialize();
          trimUnusedFieldsBuildStage = STAGE_INITIALIZED;
        }
        return this.trimUnusedFields;
      }

      void withTrimUnusedFields(boolean trimUnusedFields) {
        this.trimUnusedFields = trimUnusedFields;
        trimUnusedFieldsBuildStage = STAGE_INITIALIZED;
      }

      private byte createValuesRelBuildStage = STAGE_UNINITIALIZED;
      private boolean createValuesRel;

      boolean isCreateValuesRel() {
        if (createValuesRelBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (createValuesRelBuildStage == STAGE_UNINITIALIZED) {
          createValuesRelBuildStage = STAGE_INITIALIZING;
          this.createValuesRel = isCreateValuesRelInitialize();
          createValuesRelBuildStage = STAGE_INITIALIZED;
        }
        return this.createValuesRel;
      }

      void withCreateValuesRel(boolean createValuesRel) {
        this.createValuesRel = createValuesRel;
        createValuesRelBuildStage = STAGE_INITIALIZED;
      }

      private byte explainBuildStage = STAGE_UNINITIALIZED;
      private boolean explain;

      boolean isExplain() {
        if (explainBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (explainBuildStage == STAGE_UNINITIALIZED) {
          explainBuildStage = STAGE_INITIALIZING;
          this.explain = isExplainInitialize();
          explainBuildStage = STAGE_INITIALIZED;
        }
        return this.explain;
      }

      void withExplain(boolean explain) {
        this.explain = explain;
        explainBuildStage = STAGE_INITIALIZED;
      }

      private byte expandBuildStage = STAGE_UNINITIALIZED;
      private boolean expand;

      boolean isExpand() {
        if (expandBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (expandBuildStage == STAGE_UNINITIALIZED) {
          expandBuildStage = STAGE_INITIALIZING;
          this.expand = isExpandInitialize();
          expandBuildStage = STAGE_INITIALIZED;
        }
        return this.expand;
      }

      void withExpand(boolean expand) {
        this.expand = expand;
        expandBuildStage = STAGE_INITIALIZED;
      }

      private byte inSubQueryThresholdBuildStage = STAGE_UNINITIALIZED;
      private int inSubQueryThreshold;

      int getInSubQueryThreshold() {
        if (inSubQueryThresholdBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (inSubQueryThresholdBuildStage == STAGE_UNINITIALIZED) {
          inSubQueryThresholdBuildStage = STAGE_INITIALIZING;
          this.inSubQueryThreshold = getInSubQueryThresholdInitialize();
          inSubQueryThresholdBuildStage = STAGE_INITIALIZED;
        }
        return this.inSubQueryThreshold;
      }

      void withInSubQueryThreshold(int inSubQueryThreshold) {
        this.inSubQueryThreshold = inSubQueryThreshold;
        inSubQueryThresholdBuildStage = STAGE_INITIALIZED;
      }

      private byte removeSortInSubQueryBuildStage = STAGE_UNINITIALIZED;
      private boolean removeSortInSubQuery;

      boolean isRemoveSortInSubQuery() {
        if (removeSortInSubQueryBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (removeSortInSubQueryBuildStage == STAGE_UNINITIALIZED) {
          removeSortInSubQueryBuildStage = STAGE_INITIALIZING;
          this.removeSortInSubQuery = isRemoveSortInSubQueryInitialize();
          removeSortInSubQueryBuildStage = STAGE_INITIALIZED;
        }
        return this.removeSortInSubQuery;
      }

      void withRemoveSortInSubQuery(boolean removeSortInSubQuery) {
        this.removeSortInSubQuery = removeSortInSubQuery;
        removeSortInSubQueryBuildStage = STAGE_INITIALIZED;
      }

      private byte addJsonTypeOperatorEnabledBuildStage = STAGE_UNINITIALIZED;
      private boolean addJsonTypeOperatorEnabled;

      boolean isAddJsonTypeOperatorEnabled() {
        if (addJsonTypeOperatorEnabledBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
        if (addJsonTypeOperatorEnabledBuildStage == STAGE_UNINITIALIZED) {
          addJsonTypeOperatorEnabledBuildStage = STAGE_INITIALIZING;
          this.addJsonTypeOperatorEnabled = isAddJsonTypeOperatorEnabledInitialize();
          addJsonTypeOperatorEnabledBuildStage = STAGE_INITIALIZED;
        }
        return this.addJsonTypeOperatorEnabled;
      }

      void withAddJsonTypeOperatorEnabled(boolean addJsonTypeOperatorEnabled) {
        this.addJsonTypeOperatorEnabled = addJsonTypeOperatorEnabled;
        addJsonTypeOperatorEnabledBuildStage = STAGE_INITIALIZED;
      }

      private String formatInitCycleMessage() {
        List<String> attributes = new ArrayList<>();
        if (decorrelationEnabledBuildStage == STAGE_INITIALIZING) attributes.add("decorrelationEnabled");
        if (trimUnusedFieldsBuildStage == STAGE_INITIALIZING) attributes.add("trimUnusedFields");
        if (createValuesRelBuildStage == STAGE_INITIALIZING) attributes.add("createValuesRel");
        if (explainBuildStage == STAGE_INITIALIZING) attributes.add("explain");
        if (expandBuildStage == STAGE_INITIALIZING) attributes.add("expand");
        if (inSubQueryThresholdBuildStage == STAGE_INITIALIZING) attributes.add("inSubQueryThreshold");
        if (removeSortInSubQueryBuildStage == STAGE_INITIALIZING) attributes.add("removeSortInSubQuery");
        if (addJsonTypeOperatorEnabledBuildStage == STAGE_INITIALIZING) attributes.add("addJsonTypeOperatorEnabled");
        return "Cannot build Config, attribute initializers form cycle " + attributes;
      }
    }

    private boolean isDecorrelationEnabledInitialize() {
      return SqlToRelConverter.Config.super.isDecorrelationEnabled();
    }

    private boolean isTrimUnusedFieldsInitialize() {
      return SqlToRelConverter.Config.super.isTrimUnusedFields();
    }

    private boolean isCreateValuesRelInitialize() {
      return SqlToRelConverter.Config.super.isCreateValuesRel();
    }

    private boolean isExplainInitialize() {
      return SqlToRelConverter.Config.super.isExplain();
    }

    private boolean isExpandInitialize() {
      return SqlToRelConverter.Config.super.isExpand();
    }

    private int getInSubQueryThresholdInitialize() {
      return SqlToRelConverter.Config.super.getInSubQueryThreshold();
    }

    private boolean isRemoveSortInSubQueryInitialize() {
      return SqlToRelConverter.Config.super.isRemoveSortInSubQuery();
    }

    private boolean isAddJsonTypeOperatorEnabledInitialize() {
      return SqlToRelConverter.Config.super.isAddJsonTypeOperatorEnabled();
    }

    /**
     * @return The value of the {@code decorrelationEnabled} attribute
     */
    @Override
    public boolean isDecorrelationEnabled() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isDecorrelationEnabled()
          : this.decorrelationEnabled;
    }

    /**
     * @return The value of the {@code trimUnusedFields} attribute
     */
    @Override
    public boolean isTrimUnusedFields() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isTrimUnusedFields()
          : this.trimUnusedFields;
    }

    /**
     * @return The value of the {@code createValuesRel} attribute
     */
    @Override
    public boolean isCreateValuesRel() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isCreateValuesRel()
          : this.createValuesRel;
    }

    /**
     * @return The value of the {@code explain} attribute
     */
    @Override
    public boolean isExplain() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isExplain()
          : this.explain;
    }

    /**
     * @return The value of the {@code expand} attribute
     */
    @Override
    public boolean isExpand() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isExpand()
          : this.expand;
    }

    /**
     * @return The value of the {@code inSubQueryThreshold} attribute
     */
    @Override
    public int getInSubQueryThreshold() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.getInSubQueryThreshold()
          : this.inSubQueryThreshold;
    }

    /**
     * @return The value of the {@code removeSortInSubQuery} attribute
     */
    @Override
    public boolean isRemoveSortInSubQuery() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isRemoveSortInSubQuery()
          : this.removeSortInSubQuery;
    }

    /**
     * @return The value of the {@code relBuilderFactory} attribute
     */
    @Override
    public RelBuilderFactory getRelBuilderFactory() {
      return relBuilderFactory;
    }

    /**
     * @return The value of the {@code relBuilderConfigTransform} attribute
     */
    @Override
    public UnaryOperator<RelBuilder.Config> getRelBuilderConfigTransform() {
      return relBuilderConfigTransform;
    }

    /**
     * @return The value of the {@code hintStrategyTable} attribute
     */
    @Override
    public HintStrategyTable getHintStrategyTable() {
      return hintStrategyTable;
    }

    /**
     * @return The value of the {@code addJsonTypeOperatorEnabled} attribute
     */
    @Override
    public boolean isAddJsonTypeOperatorEnabled() {
      InitShim shim = this.initShim;
      return shim != null
          ? shim.isAddJsonTypeOperatorEnabled()
          : this.addJsonTypeOperatorEnabled;
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isDecorrelationEnabled() decorrelationEnabled} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for decorrelationEnabled
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withDecorrelationEnabled(boolean value) {
      if (this.decorrelationEnabled == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          value,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isTrimUnusedFields() trimUnusedFields} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for trimUnusedFields
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withTrimUnusedFields(boolean value) {
      if (this.trimUnusedFields == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          value,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isCreateValuesRel() createValuesRel} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for createValuesRel
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withCreateValuesRel(boolean value) {
      if (this.createValuesRel == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          value,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isExplain() explain} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for explain
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withExplain(boolean value) {
      if (this.explain == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          value,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isExpand() expand} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for expand
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withExpand(boolean value) {
      if (this.expand == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          value,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#getInSubQueryThreshold() inSubQueryThreshold} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for inSubQueryThreshold
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withInSubQueryThreshold(int value) {
      if (this.inSubQueryThreshold == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          value,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isRemoveSortInSubQuery() removeSortInSubQuery} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for removeSortInSubQuery
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withRemoveSortInSubQuery(boolean value) {
      if (this.removeSortInSubQuery == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          value,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#getRelBuilderFactory() relBuilderFactory} attribute.
     * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for relBuilderFactory
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withRelBuilderFactory(RelBuilderFactory value) {
      if (this.relBuilderFactory == value) return this;
      RelBuilderFactory newValue = Objects.requireNonNull(value, "relBuilderFactory");
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          newValue,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#getRelBuilderConfigTransform() relBuilderConfigTransform} attribute.
     * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for relBuilderConfigTransform
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withRelBuilderConfigTransform(UnaryOperator<RelBuilder.Config> value) {
      if (this.relBuilderConfigTransform == value) return this;
      UnaryOperator<RelBuilder.Config> newValue = Objects.requireNonNull(value, "relBuilderConfigTransform");
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          newValue,
          this.hintStrategyTable,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#getHintStrategyTable() hintStrategyTable} attribute.
     * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for hintStrategyTable
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withHintStrategyTable(HintStrategyTable value) {
      if (this.hintStrategyTable == value) return this;
      HintStrategyTable newValue = Objects.requireNonNull(value, "hintStrategyTable");
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          newValue,
          this.addJsonTypeOperatorEnabled);
    }

    /**
     * Copy the current immutable object by setting a value for the {@link SqlToRelConverter.Config#isAddJsonTypeOperatorEnabled() addJsonTypeOperatorEnabled} attribute.
     * A value equality check is used to prevent copying of the same value by returning {@code this}.
     * @param value A new value for addJsonTypeOperatorEnabled
     * @return A modified copy of the {@code this} object
     */
    public final ImmutableSqlToRelConverter.Config withAddJsonTypeOperatorEnabled(boolean value) {
      if (this.addJsonTypeOperatorEnabled == value) return this;
      return new ImmutableSqlToRelConverter.Config(
          this.decorrelationEnabled,
          this.trimUnusedFields,
          this.createValuesRel,
          this.explain,
          this.expand,
          this.inSubQueryThreshold,
          this.removeSortInSubQuery,
          this.relBuilderFactory,
          this.relBuilderConfigTransform,
          this.hintStrategyTable,
          value);
    }

    /**
     * This instance is equal to all instances of {@code Config} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
      if (this == another) return true;
      return another instanceof ImmutableSqlToRelConverter.Config
          && equalTo((ImmutableSqlToRelConverter.Config) another);
    }

    private boolean equalTo(ImmutableSqlToRelConverter.Config another) {
      return decorrelationEnabled == another.decorrelationEnabled
          && trimUnusedFields == another.trimUnusedFields
          && createValuesRel == another.createValuesRel
          && explain == another.explain
          && expand == another.expand
          && inSubQueryThreshold == another.inSubQueryThreshold
          && removeSortInSubQuery == another.removeSortInSubQuery
          && relBuilderFactory.equals(another.relBuilderFactory)
          && relBuilderConfigTransform.equals(another.relBuilderConfigTransform)
          && hintStrategyTable.equals(another.hintStrategyTable)
          && addJsonTypeOperatorEnabled == another.addJsonTypeOperatorEnabled;
    }

    /**
     * Computes a hash code from attributes: {@code decorrelationEnabled}, {@code trimUnusedFields}, {@code createValuesRel}, {@code explain}, {@code expand}, {@code inSubQueryThreshold}, {@code removeSortInSubQuery}, {@code relBuilderFactory}, {@code relBuilderConfigTransform}, {@code hintStrategyTable}, {@code addJsonTypeOperatorEnabled}.
     * @return hashCode value
     */
    @Override
    public int hashCode() {
      @Var int h = 5381;
      h += (h << 5) + Booleans.hashCode(decorrelationEnabled);
      h += (h << 5) + Booleans.hashCode(trimUnusedFields);
      h += (h << 5) + Booleans.hashCode(createValuesRel);
      h += (h << 5) + Booleans.hashCode(explain);
      h += (h << 5) + Booleans.hashCode(expand);
      h += (h << 5) + inSubQueryThreshold;
      h += (h << 5) + Booleans.hashCode(removeSortInSubQuery);
      h += (h << 5) + relBuilderFactory.hashCode();
      h += (h << 5) + relBuilderConfigTransform.hashCode();
      h += (h << 5) + hintStrategyTable.hashCode();
      h += (h << 5) + Booleans.hashCode(addJsonTypeOperatorEnabled);
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
          .add("decorrelationEnabled", decorrelationEnabled)
          .add("trimUnusedFields", trimUnusedFields)
          .add("createValuesRel", createValuesRel)
          .add("explain", explain)
          .add("expand", expand)
          .add("inSubQueryThreshold", inSubQueryThreshold)
          .add("removeSortInSubQuery", removeSortInSubQuery)
          .add("relBuilderFactory", relBuilderFactory)
          .add("relBuilderConfigTransform", relBuilderConfigTransform)
          .add("hintStrategyTable", hintStrategyTable)
          .add("addJsonTypeOperatorEnabled", addJsonTypeOperatorEnabled)
          .toString();
    }

    /**
     * Creates an immutable copy of a {@link SqlToRelConverter.Config} value.
     * Uses accessors to get values to initialize the new immutable instance.
     * If an instance is already immutable, it is returned as is.
     * @param instance The instance to copy
     * @return A copied immutable Config instance
     */
    public static ImmutableSqlToRelConverter.Config copyOf(SqlToRelConverter.Config instance) {
      if (instance instanceof ImmutableSqlToRelConverter.Config) {
        return (ImmutableSqlToRelConverter.Config) instance;
      }
      return ImmutableSqlToRelConverter.Config.builder()
          .from(instance)
          .build();
    }

    /**
     * Creates a builder for {@link ImmutableSqlToRelConverter.Config Config}.
     * <pre>
     * ImmutableSqlToRelConverter.Config.builder()
     *    .withDecorrelationEnabled(boolean) // optional {@link SqlToRelConverter.Config#isDecorrelationEnabled() decorrelationEnabled}
     *    .withTrimUnusedFields(boolean) // optional {@link SqlToRelConverter.Config#isTrimUnusedFields() trimUnusedFields}
     *    .withCreateValuesRel(boolean) // optional {@link SqlToRelConverter.Config#isCreateValuesRel() createValuesRel}
     *    .withExplain(boolean) // optional {@link SqlToRelConverter.Config#isExplain() explain}
     *    .withExpand(boolean) // optional {@link SqlToRelConverter.Config#isExpand() expand}
     *    .withInSubQueryThreshold(int) // optional {@link SqlToRelConverter.Config#getInSubQueryThreshold() inSubQueryThreshold}
     *    .withRemoveSortInSubQuery(boolean) // optional {@link SqlToRelConverter.Config#isRemoveSortInSubQuery() removeSortInSubQuery}
     *    .withRelBuilderFactory(org.apache.calcite.tools.RelBuilderFactory) // required {@link SqlToRelConverter.Config#getRelBuilderFactory() relBuilderFactory}
     *    .withRelBuilderConfigTransform(function.UnaryOperator&amp;lt;org.apache.calcite.tools.RelBuilder.Config&amp;gt;) // required {@link SqlToRelConverter.Config#getRelBuilderConfigTransform() relBuilderConfigTransform}
     *    .withHintStrategyTable(org.apache.calcite.rel.hint.HintStrategyTable) // required {@link SqlToRelConverter.Config#getHintStrategyTable() hintStrategyTable}
     *    .withAddJsonTypeOperatorEnabled(boolean) // optional {@link SqlToRelConverter.Config#isAddJsonTypeOperatorEnabled() addJsonTypeOperatorEnabled}
     *    .build();
     * </pre>
     * @return A new Config builder
     */
    public static ImmutableSqlToRelConverter.Config.Builder builder() {
      return new ImmutableSqlToRelConverter.Config.Builder();
    }

    /**
     * Builds instances of type {@link ImmutableSqlToRelConverter.Config Config}.
     * Initialize attributes and then invoke the {@link #build()} method to create an
     * immutable instance.
     * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
     * but instead used immediately to create instances.</em>
     */
    @Generated(from = "SqlToRelConverter.Config", generator = "Immutables")
    @NotThreadSafe
    public static final class Builder {
      private static final long INIT_BIT_REL_BUILDER_FACTORY = 0x1L;
      private static final long INIT_BIT_REL_BUILDER_CONFIG_TRANSFORM = 0x2L;
      private static final long INIT_BIT_HINT_STRATEGY_TABLE = 0x4L;
      private static final long OPT_BIT_DECORRELATION_ENABLED = 0x1L;
      private static final long OPT_BIT_TRIM_UNUSED_FIELDS = 0x2L;
      private static final long OPT_BIT_CREATE_VALUES_REL = 0x4L;
      private static final long OPT_BIT_EXPLAIN = 0x8L;
      private static final long OPT_BIT_EXPAND = 0x10L;
      private static final long OPT_BIT_IN_SUB_QUERY_THRESHOLD = 0x20L;
      private static final long OPT_BIT_REMOVE_SORT_IN_SUB_QUERY = 0x40L;
      private static final long OPT_BIT_ADD_JSON_TYPE_OPERATOR_ENABLED = 0x80L;
      private long initBits = 0x7L;
      private long optBits;

      private boolean decorrelationEnabled;
      private boolean trimUnusedFields;
      private boolean createValuesRel;
      private boolean explain;
      private boolean expand;
      private int inSubQueryThreshold;
      private boolean removeSortInSubQuery;
      private @Nullable RelBuilderFactory relBuilderFactory;
      private @Nullable UnaryOperator<RelBuilder.Config> relBuilderConfigTransform;
      private @Nullable HintStrategyTable hintStrategyTable;
      private boolean addJsonTypeOperatorEnabled;

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
      public final Builder from(SqlToRelConverter.Config instance) {
        Objects.requireNonNull(instance, "instance");
        withDecorrelationEnabled(instance.isDecorrelationEnabled());
        withTrimUnusedFields(instance.isTrimUnusedFields());
        withCreateValuesRel(instance.isCreateValuesRel());
        withExplain(instance.isExplain());
        withExpand(instance.isExpand());
        withInSubQueryThreshold(instance.getInSubQueryThreshold());
        withRemoveSortInSubQuery(instance.isRemoveSortInSubQuery());
        withRelBuilderFactory(instance.getRelBuilderFactory());
        withRelBuilderConfigTransform(instance.getRelBuilderConfigTransform());
        withHintStrategyTable(instance.getHintStrategyTable());
        withAddJsonTypeOperatorEnabled(instance.isAddJsonTypeOperatorEnabled());
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isDecorrelationEnabled() decorrelationEnabled} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isDecorrelationEnabled() decorrelationEnabled}.</em>
       * @param decorrelationEnabled The value for decorrelationEnabled 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withDecorrelationEnabled(boolean decorrelationEnabled) {
        this.decorrelationEnabled = decorrelationEnabled;
        optBits |= OPT_BIT_DECORRELATION_ENABLED;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isTrimUnusedFields() trimUnusedFields} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isTrimUnusedFields() trimUnusedFields}.</em>
       * @param trimUnusedFields The value for trimUnusedFields 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withTrimUnusedFields(boolean trimUnusedFields) {
        this.trimUnusedFields = trimUnusedFields;
        optBits |= OPT_BIT_TRIM_UNUSED_FIELDS;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isCreateValuesRel() createValuesRel} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isCreateValuesRel() createValuesRel}.</em>
       * @param createValuesRel The value for createValuesRel 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withCreateValuesRel(boolean createValuesRel) {
        this.createValuesRel = createValuesRel;
        optBits |= OPT_BIT_CREATE_VALUES_REL;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isExplain() explain} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isExplain() explain}.</em>
       * @param explain The value for explain 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withExplain(boolean explain) {
        this.explain = explain;
        optBits |= OPT_BIT_EXPLAIN;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isExpand() expand} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isExpand() expand}.</em>
       * @param expand The value for expand 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withExpand(boolean expand) {
        this.expand = expand;
        optBits |= OPT_BIT_EXPAND;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#getInSubQueryThreshold() inSubQueryThreshold} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#getInSubQueryThreshold() inSubQueryThreshold}.</em>
       * @param inSubQueryThreshold The value for inSubQueryThreshold 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withInSubQueryThreshold(int inSubQueryThreshold) {
        this.inSubQueryThreshold = inSubQueryThreshold;
        optBits |= OPT_BIT_IN_SUB_QUERY_THRESHOLD;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isRemoveSortInSubQuery() removeSortInSubQuery} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isRemoveSortInSubQuery() removeSortInSubQuery}.</em>
       * @param removeSortInSubQuery The value for removeSortInSubQuery 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withRemoveSortInSubQuery(boolean removeSortInSubQuery) {
        this.removeSortInSubQuery = removeSortInSubQuery;
        optBits |= OPT_BIT_REMOVE_SORT_IN_SUB_QUERY;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#getRelBuilderFactory() relBuilderFactory} attribute.
       * @param relBuilderFactory The value for relBuilderFactory 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withRelBuilderFactory(RelBuilderFactory relBuilderFactory) {
        this.relBuilderFactory = Objects.requireNonNull(relBuilderFactory, "relBuilderFactory");
        initBits &= ~INIT_BIT_REL_BUILDER_FACTORY;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#getRelBuilderConfigTransform() relBuilderConfigTransform} attribute.
       * @param relBuilderConfigTransform The value for relBuilderConfigTransform 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withRelBuilderConfigTransform(UnaryOperator<RelBuilder.Config> relBuilderConfigTransform) {
        this.relBuilderConfigTransform = Objects.requireNonNull(relBuilderConfigTransform, "relBuilderConfigTransform");
        initBits &= ~INIT_BIT_REL_BUILDER_CONFIG_TRANSFORM;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#getHintStrategyTable() hintStrategyTable} attribute.
       * @param hintStrategyTable The value for hintStrategyTable 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withHintStrategyTable(HintStrategyTable hintStrategyTable) {
        this.hintStrategyTable = Objects.requireNonNull(hintStrategyTable, "hintStrategyTable");
        initBits &= ~INIT_BIT_HINT_STRATEGY_TABLE;
        return this;
      }

      /**
       * Initializes the value for the {@link SqlToRelConverter.Config#isAddJsonTypeOperatorEnabled() addJsonTypeOperatorEnabled} attribute.
       * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SqlToRelConverter.Config#isAddJsonTypeOperatorEnabled() addJsonTypeOperatorEnabled}.</em>
       * @param addJsonTypeOperatorEnabled The value for addJsonTypeOperatorEnabled 
       * @return {@code this} builder for use in a chained invocation
       */
      @CanIgnoreReturnValue 
      public final Builder withAddJsonTypeOperatorEnabled(boolean addJsonTypeOperatorEnabled) {
        this.addJsonTypeOperatorEnabled = addJsonTypeOperatorEnabled;
        optBits |= OPT_BIT_ADD_JSON_TYPE_OPERATOR_ENABLED;
        return this;
      }

      /**
       * Builds a new {@link ImmutableSqlToRelConverter.Config Config}.
       * @return An immutable instance of Config
       * @throws java.lang.IllegalStateException if any required attributes are missing
       */
      public ImmutableSqlToRelConverter.Config build() {
        if (initBits != 0) {
          throw new IllegalStateException(formatRequiredAttributesMessage());
        }
        return new ImmutableSqlToRelConverter.Config(this);
      }

      private boolean decorrelationEnabledIsSet() {
        return (optBits & OPT_BIT_DECORRELATION_ENABLED) != 0;
      }

      private boolean trimUnusedFieldsIsSet() {
        return (optBits & OPT_BIT_TRIM_UNUSED_FIELDS) != 0;
      }

      private boolean createValuesRelIsSet() {
        return (optBits & OPT_BIT_CREATE_VALUES_REL) != 0;
      }

      private boolean explainIsSet() {
        return (optBits & OPT_BIT_EXPLAIN) != 0;
      }

      private boolean expandIsSet() {
        return (optBits & OPT_BIT_EXPAND) != 0;
      }

      private boolean inSubQueryThresholdIsSet() {
        return (optBits & OPT_BIT_IN_SUB_QUERY_THRESHOLD) != 0;
      }

      private boolean removeSortInSubQueryIsSet() {
        return (optBits & OPT_BIT_REMOVE_SORT_IN_SUB_QUERY) != 0;
      }

      private boolean addJsonTypeOperatorEnabledIsSet() {
        return (optBits & OPT_BIT_ADD_JSON_TYPE_OPERATOR_ENABLED) != 0;
      }

      private String formatRequiredAttributesMessage() {
        List<String> attributes = new ArrayList<>();
        if ((initBits & INIT_BIT_REL_BUILDER_FACTORY) != 0) attributes.add("relBuilderFactory");
        if ((initBits & INIT_BIT_REL_BUILDER_CONFIG_TRANSFORM) != 0) attributes.add("relBuilderConfigTransform");
        if ((initBits & INIT_BIT_HINT_STRATEGY_TABLE) != 0) attributes.add("hintStrategyTable");
        return "Cannot build Config, some of required attributes are not set " + attributes;
      }
    }
  }
}
