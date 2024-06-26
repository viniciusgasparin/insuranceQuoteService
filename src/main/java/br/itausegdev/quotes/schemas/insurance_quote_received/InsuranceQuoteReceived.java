/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.itausegdev.quotes.schemas.insurance_quote_received;

import java.math.BigDecimal;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class InsuranceQuoteReceived extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3794061737992243967L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InsuranceQuoteReceived\",\"namespace\":\"br.itausegdev.quotes.schemas.insurance_quote_received\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"product_id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"offer_id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"category\",\"type\":{\"type\":\"enum\",\"name\":\"Category\",\"symbols\":[\"HOME\",\"TRAVEL\",\"PET\",\"LIFE\",\"AUTO\"]}},{\"name\":\"created_at\",\"type\":{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}},{\"name\":\"total_monthly_premium_amount\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":4}},{\"name\":\"total_coverage_amount\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":4}},{\"name\":\"coverages\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":4}}},{\"name\":\"assistances\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"customer\",\"type\":{\"type\":\"record\",\"name\":\"Customer\",\"fields\":[{\"name\":\"document_number\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<InsuranceQuoteReceived> ENCODER =
      new BinaryMessageEncoder<InsuranceQuoteReceived>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InsuranceQuoteReceived> DECODER =
      new BinaryMessageDecoder<InsuranceQuoteReceived>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<InsuranceQuoteReceived> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<InsuranceQuoteReceived> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<InsuranceQuoteReceived> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InsuranceQuoteReceived>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this InsuranceQuoteReceived to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a InsuranceQuoteReceived from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a InsuranceQuoteReceived instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static InsuranceQuoteReceived fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long id;
  private java.lang.CharSequence product_id;
  private java.lang.CharSequence offer_id;
  private br.itausegdev.quotes.schemas.insurance_quote_received.Category category;
  private java.time.LocalDateTime created_at;
  private BigDecimal total_monthly_premium_amount;
  private BigDecimal total_coverage_amount;
  private java.util.Map<String,BigDecimal> coverages;
  private java.util.List<java.lang.CharSequence> assistances;
  private br.itausegdev.quotes.schemas.insurance_quote_received.Customer customer;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InsuranceQuoteReceived() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param product_id The new value for product_id
   * @param offer_id The new value for offer_id
   * @param category The new value for category
   * @param created_at The new value for created_at
   * @param total_monthly_premium_amount The new value for total_monthly_premium_amount
   * @param total_coverage_amount The new value for total_coverage_amount
   * @param coverages The new value for coverages
   * @param assistances The new value for assistances
   * @param customer The new value for customer
   */
  public InsuranceQuoteReceived(java.lang.Long id, java.lang.CharSequence product_id, java.lang.CharSequence offer_id, br.itausegdev.quotes.schemas.insurance_quote_received.Category category, java.time.LocalDateTime created_at, BigDecimal total_monthly_premium_amount, BigDecimal total_coverage_amount, java.util.Map<String,BigDecimal> coverages, java.util.List<java.lang.CharSequence> assistances, br.itausegdev.quotes.schemas.insurance_quote_received.Customer customer) {
    this.id = id;
    this.product_id = product_id;
    this.offer_id = offer_id;
    this.category = category;
    this.created_at = created_at;
    this.total_monthly_premium_amount = total_monthly_premium_amount;
    this.total_coverage_amount = total_coverage_amount;
    this.coverages = coverages;
    this.assistances = assistances;
    this.customer = customer;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return product_id;
    case 2: return offer_id;
    case 3: return category;
    case 4: return created_at;
    case 5: return total_monthly_premium_amount;
    case 6: return total_coverage_amount;
    case 7: return coverages;
    case 8: return assistances;
    case 9: return customer;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.LocalTimestampMillisConversion(),
      null,
      null,
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: product_id = (java.lang.CharSequence)value$; break;
    case 2: offer_id = (java.lang.CharSequence)value$; break;
    case 3: category = (br.itausegdev.quotes.schemas.insurance_quote_received.Category)value$; break;
    case 4: created_at = (java.time.LocalDateTime)value$; break;
    case 5: total_monthly_premium_amount = (BigDecimal)value$; break;
    case 6: total_coverage_amount = (BigDecimal)value$; break;
    case 7: coverages = (java.util.Map<String,BigDecimal>)value$; break;
    case 8: assistances = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: customer = (br.itausegdev.quotes.schemas.insurance_quote_received.Customer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'product_id' field.
   * @return The value of the 'product_id' field.
   */
  public java.lang.CharSequence getProductId() {
    return product_id;
  }


  /**
   * Sets the value of the 'product_id' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.CharSequence value) {
    this.product_id = value;
  }

  /**
   * Gets the value of the 'offer_id' field.
   * @return The value of the 'offer_id' field.
   */
  public java.lang.CharSequence getOfferId() {
    return offer_id;
  }


  /**
   * Sets the value of the 'offer_id' field.
   * @param value the value to set.
   */
  public void setOfferId(java.lang.CharSequence value) {
    this.offer_id = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public br.itausegdev.quotes.schemas.insurance_quote_received.Category getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(br.itausegdev.quotes.schemas.insurance_quote_received.Category value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public java.time.LocalDateTime getCreatedAt() {
    return created_at;
  }


  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.time.LocalDateTime value) {
    this.created_at = value;
  }

  /**
   * Gets the value of the 'total_monthly_premium_amount' field.
   * @return The value of the 'total_monthly_premium_amount' field.
   */
  public BigDecimal getTotalMonthlyPremiumAmount() {
    return total_monthly_premium_amount;
  }


  /**
   * Sets the value of the 'total_monthly_premium_amount' field.
   * @param value the value to set.
   */
  public void setTotalMonthlyPremiumAmount(BigDecimal value) {
    this.total_monthly_premium_amount = value;
  }

  /**
   * Gets the value of the 'total_coverage_amount' field.
   * @return The value of the 'total_coverage_amount' field.
   */
  public BigDecimal getTotalCoverageAmount() {
    return total_coverage_amount;
  }


  /**
   * Sets the value of the 'total_coverage_amount' field.
   * @param value the value to set.
   */
  public void setTotalCoverageAmount(BigDecimal value) {
    this.total_coverage_amount = value;
  }

  /**
   * Gets the value of the 'coverages' field.
   * @return The value of the 'coverages' field.
   */
  public java.util.Map<String,BigDecimal> getCoverages() {
    return coverages;
  }


  /**
   * Sets the value of the 'coverages' field.
   * @param value the value to set.
   */
  public void setCoverages(java.util.Map<String,BigDecimal> value) {
    this.coverages = value;
  }

  /**
   * Gets the value of the 'assistances' field.
   * @return The value of the 'assistances' field.
   */
  public java.util.List<java.lang.CharSequence> getAssistances() {
    return assistances;
  }


  /**
   * Sets the value of the 'assistances' field.
   * @param value the value to set.
   */
  public void setAssistances(java.util.List<java.lang.CharSequence> value) {
    this.assistances = value;
  }

  /**
   * Gets the value of the 'customer' field.
   * @return The value of the 'customer' field.
   */
  public br.itausegdev.quotes.schemas.insurance_quote_received.Customer getCustomer() {
    return customer;
  }


  /**
   * Sets the value of the 'customer' field.
   * @param value the value to set.
   */
  public void setCustomer(br.itausegdev.quotes.schemas.insurance_quote_received.Customer value) {
    this.customer = value;
  }

  /**
   * Creates a new InsuranceQuoteReceived RecordBuilder.
   * @return A new InsuranceQuoteReceived RecordBuilder
   */
  public static br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder newBuilder() {
    return new br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder();
  }

  /**
   * Creates a new InsuranceQuoteReceived RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InsuranceQuoteReceived RecordBuilder
   */
  public static br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder newBuilder(br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder other) {
    if (other == null) {
      return new br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder();
    } else {
      return new br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder(other);
    }
  }

  /**
   * Creates a new InsuranceQuoteReceived RecordBuilder by copying an existing InsuranceQuoteReceived instance.
   * @param other The existing instance to copy.
   * @return A new InsuranceQuoteReceived RecordBuilder
   */
  public static br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder newBuilder(br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived other) {
    if (other == null) {
      return new br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder();
    } else {
      return new br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder(other);
    }
  }

  /**
   * RecordBuilder for InsuranceQuoteReceived instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InsuranceQuoteReceived>
    implements org.apache.avro.data.RecordBuilder<InsuranceQuoteReceived> {

    private long id;
    private java.lang.CharSequence product_id;
    private java.lang.CharSequence offer_id;
    private br.itausegdev.quotes.schemas.insurance_quote_received.Category category;
    private java.time.LocalDateTime created_at;
    private BigDecimal total_monthly_premium_amount;
    private BigDecimal total_coverage_amount;
    private java.util.Map<String,BigDecimal> coverages;
    private java.util.List<java.lang.CharSequence> assistances;
    private br.itausegdev.quotes.schemas.insurance_quote_received.Customer customer;
    private br.itausegdev.quotes.schemas.insurance_quote_received.Customer.Builder customerBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.product_id)) {
        this.product_id = data().deepCopy(fields()[1].schema(), other.product_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[2].schema(), other.offer_id);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.created_at)) {
        this.created_at = data().deepCopy(fields()[4].schema(), other.created_at);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.total_monthly_premium_amount)) {
        this.total_monthly_premium_amount = data().deepCopy(fields()[5].schema(), other.total_monthly_premium_amount);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.total_coverage_amount)) {
        this.total_coverage_amount = data().deepCopy(fields()[6].schema(), other.total_coverage_amount);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.coverages)) {
        this.coverages = data().deepCopy(fields()[7].schema(), other.coverages);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.assistances)) {
        this.assistances = data().deepCopy(fields()[8].schema(), other.assistances);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.customer)) {
        this.customer = data().deepCopy(fields()[9].schema(), other.customer);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (other.hasCustomerBuilder()) {
        this.customerBuilder = br.itausegdev.quotes.schemas.insurance_quote_received.Customer.newBuilder(other.getCustomerBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing InsuranceQuoteReceived instance
     * @param other The existing instance to copy.
     */
    private Builder(br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_id)) {
        this.product_id = data().deepCopy(fields()[1].schema(), other.product_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.offer_id)) {
        this.offer_id = data().deepCopy(fields()[2].schema(), other.offer_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.created_at)) {
        this.created_at = data().deepCopy(fields()[4].schema(), other.created_at);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.total_monthly_premium_amount)) {
        this.total_monthly_premium_amount = data().deepCopy(fields()[5].schema(), other.total_monthly_premium_amount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.total_coverage_amount)) {
        this.total_coverage_amount = data().deepCopy(fields()[6].schema(), other.total_coverage_amount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.coverages)) {
        this.coverages = data().deepCopy(fields()[7].schema(), other.coverages);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.assistances)) {
        this.assistances = data().deepCopy(fields()[8].schema(), other.assistances);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.customer)) {
        this.customer = data().deepCopy(fields()[9].schema(), other.customer);
        fieldSetFlags()[9] = true;
      }
      this.customerBuilder = null;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'product_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductId() {
      return product_id;
    }


    /**
      * Sets the value of the 'product_id' field.
      * @param value The value of 'product_id'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setProductId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.product_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'product_id' field has been set.
      * @return True if the 'product_id' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'product_id' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearProductId() {
      product_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'offer_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getOfferId() {
      return offer_id;
    }


    /**
      * Sets the value of the 'offer_id' field.
      * @param value The value of 'offer_id'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setOfferId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.offer_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'offer_id' field has been set.
      * @return True if the 'offer_id' field has been set, false otherwise.
      */
    public boolean hasOfferId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'offer_id' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearOfferId() {
      offer_id = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.Category getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setCategory(br.itausegdev.quotes.schemas.insurance_quote_received.Category value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public java.time.LocalDateTime getCreatedAt() {
      return created_at;
    }


    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setCreatedAt(java.time.LocalDateTime value) {
      validate(fields()[4], value);
      this.created_at = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearCreatedAt() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'total_monthly_premium_amount' field.
      * @return The value.
      */
    public BigDecimal getTotalMonthlyPremiumAmount() {
      return total_monthly_premium_amount;
    }


    /**
      * Sets the value of the 'total_monthly_premium_amount' field.
      * @param value The value of 'total_monthly_premium_amount'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setTotalMonthlyPremiumAmount(BigDecimal value) {
      validate(fields()[5], value);
      this.total_monthly_premium_amount = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'total_monthly_premium_amount' field has been set.
      * @return True if the 'total_monthly_premium_amount' field has been set, false otherwise.
      */
    public boolean hasTotalMonthlyPremiumAmount() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'total_monthly_premium_amount' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearTotalMonthlyPremiumAmount() {
      total_monthly_premium_amount = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'total_coverage_amount' field.
      * @return The value.
      */
    public BigDecimal getTotalCoverageAmount() {
      return total_coverage_amount;
    }


    /**
      * Sets the value of the 'total_coverage_amount' field.
      * @param value The value of 'total_coverage_amount'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setTotalCoverageAmount(BigDecimal value) {
      validate(fields()[6], value);
      this.total_coverage_amount = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'total_coverage_amount' field has been set.
      * @return True if the 'total_coverage_amount' field has been set, false otherwise.
      */
    public boolean hasTotalCoverageAmount() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'total_coverage_amount' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearTotalCoverageAmount() {
      total_coverage_amount = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'coverages' field.
      * @return The value.
      */
    public java.util.Map<String,BigDecimal> getCoverages() {
      return coverages;
    }


    /**
      * Sets the value of the 'coverages' field.
      * @param value The value of 'coverages'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setCoverages(java.util.Map<String,BigDecimal> value) {
      validate(fields()[7], value);
      this.coverages = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'coverages' field has been set.
      * @return True if the 'coverages' field has been set, false otherwise.
      */
    public boolean hasCoverages() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'coverages' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearCoverages() {
      coverages = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'assistances' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getAssistances() {
      return assistances;
    }


    /**
      * Sets the value of the 'assistances' field.
      * @param value The value of 'assistances'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setAssistances(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.assistances = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'assistances' field has been set.
      * @return True if the 'assistances' field has been set, false otherwise.
      */
    public boolean hasAssistances() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'assistances' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearAssistances() {
      assistances = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer' field.
      * @return The value.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.Customer getCustomer() {
      return customer;
    }


    /**
      * Sets the value of the 'customer' field.
      * @param value The value of 'customer'.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setCustomer(br.itausegdev.quotes.schemas.insurance_quote_received.Customer value) {
      validate(fields()[9], value);
      this.customerBuilder = null;
      this.customer = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'customer' field has been set.
      * @return True if the 'customer' field has been set, false otherwise.
      */
    public boolean hasCustomer() {
      return fieldSetFlags()[9];
    }

    /**
     * Gets the Builder instance for the 'customer' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public br.itausegdev.quotes.schemas.insurance_quote_received.Customer.Builder getCustomerBuilder() {
      if (customerBuilder == null) {
        if (hasCustomer()) {
          setCustomerBuilder(br.itausegdev.quotes.schemas.insurance_quote_received.Customer.newBuilder(customer));
        } else {
          setCustomerBuilder(br.itausegdev.quotes.schemas.insurance_quote_received.Customer.newBuilder());
        }
      }
      return customerBuilder;
    }

    /**
     * Sets the Builder instance for the 'customer' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder setCustomerBuilder(br.itausegdev.quotes.schemas.insurance_quote_received.Customer.Builder value) {
      clearCustomer();
      customerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'customer' field has an active Builder instance
     * @return True if the 'customer' field has an active Builder instance
     */
    public boolean hasCustomerBuilder() {
      return customerBuilder != null;
    }

    /**
      * Clears the value of the 'customer' field.
      * @return This builder.
      */
    public br.itausegdev.quotes.schemas.insurance_quote_received.InsuranceQuoteReceived.Builder clearCustomer() {
      customer = null;
      customerBuilder = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InsuranceQuoteReceived build() {
      try {
        InsuranceQuoteReceived record = new InsuranceQuoteReceived();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.product_id = fieldSetFlags()[1] ? this.product_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.offer_id = fieldSetFlags()[2] ? this.offer_id : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (br.itausegdev.quotes.schemas.insurance_quote_received.Category) defaultValue(fields()[3]);
        record.created_at = fieldSetFlags()[4] ? this.created_at : (java.time.LocalDateTime) defaultValue(fields()[4]);
        record.total_monthly_premium_amount = fieldSetFlags()[5] ? this.total_monthly_premium_amount : (BigDecimal) defaultValue(fields()[5]);
        record.total_coverage_amount = fieldSetFlags()[6] ? this.total_coverage_amount : (BigDecimal) defaultValue(fields()[6]);
        record.coverages = fieldSetFlags()[7] ? this.coverages : (java.util.Map<String,BigDecimal>) defaultValue(fields()[7]);
        record.assistances = fieldSetFlags()[8] ? this.assistances : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        if (customerBuilder != null) {
          try {
            record.customer = this.customerBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("customer"));
            throw e;
          }
        } else {
          record.customer = fieldSetFlags()[9] ? this.customer : (br.itausegdev.quotes.schemas.insurance_quote_received.Customer) defaultValue(fields()[9]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InsuranceQuoteReceived>
    WRITER$ = (org.apache.avro.io.DatumWriter<InsuranceQuoteReceived>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InsuranceQuoteReceived>
    READER$ = (org.apache.avro.io.DatumReader<InsuranceQuoteReceived>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










