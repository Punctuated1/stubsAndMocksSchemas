/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package myapp.generated.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TwitterEventFeedbackDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4134638152680580626L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwitterEventFeedbackDto\",\"namespace\":\"myapp.generated.avro\",\"fields\":[{\"name\":\"eventId\",\"type\":\"string\"},{\"name\":\"twitterAccount\",\"type\":\"string\"},{\"name\":\"twitterHashTags\",\"type\":\"string\"},{\"name\":\"twitterMessage\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TwitterEventFeedbackDto> ENCODER =
      new BinaryMessageEncoder<TwitterEventFeedbackDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TwitterEventFeedbackDto> DECODER =
      new BinaryMessageDecoder<TwitterEventFeedbackDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TwitterEventFeedbackDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TwitterEventFeedbackDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TwitterEventFeedbackDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TwitterEventFeedbackDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TwitterEventFeedbackDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TwitterEventFeedbackDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TwitterEventFeedbackDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TwitterEventFeedbackDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence eventId;
   private java.lang.CharSequence twitterAccount;
   private java.lang.CharSequence twitterHashTags;
   private java.lang.CharSequence twitterMessage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TwitterEventFeedbackDto() {}

  /**
   * All-args constructor.
   * @param eventId The new value for eventId
   * @param twitterAccount The new value for twitterAccount
   * @param twitterHashTags The new value for twitterHashTags
   * @param twitterMessage The new value for twitterMessage
   */
  public TwitterEventFeedbackDto(java.lang.CharSequence eventId, java.lang.CharSequence twitterAccount, java.lang.CharSequence twitterHashTags, java.lang.CharSequence twitterMessage) {
    this.eventId = eventId;
    this.twitterAccount = twitterAccount;
    this.twitterHashTags = twitterHashTags;
    this.twitterMessage = twitterMessage;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventId;
    case 1: return twitterAccount;
    case 2: return twitterHashTags;
    case 3: return twitterMessage;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventId = (java.lang.CharSequence)value$; break;
    case 1: twitterAccount = (java.lang.CharSequence)value$; break;
    case 2: twitterHashTags = (java.lang.CharSequence)value$; break;
    case 3: twitterMessage = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventId' field.
   * @return The value of the 'eventId' field.
   */
  public java.lang.CharSequence getEventId() {
    return eventId;
  }


  /**
   * Sets the value of the 'eventId' field.
   * @param value the value to set.
   */
  public void setEventId(java.lang.CharSequence value) {
    this.eventId = value;
  }

  /**
   * Gets the value of the 'twitterAccount' field.
   * @return The value of the 'twitterAccount' field.
   */
  public java.lang.CharSequence getTwitterAccount() {
    return twitterAccount;
  }


  /**
   * Sets the value of the 'twitterAccount' field.
   * @param value the value to set.
   */
  public void setTwitterAccount(java.lang.CharSequence value) {
    this.twitterAccount = value;
  }

  /**
   * Gets the value of the 'twitterHashTags' field.
   * @return The value of the 'twitterHashTags' field.
   */
  public java.lang.CharSequence getTwitterHashTags() {
    return twitterHashTags;
  }


  /**
   * Sets the value of the 'twitterHashTags' field.
   * @param value the value to set.
   */
  public void setTwitterHashTags(java.lang.CharSequence value) {
    this.twitterHashTags = value;
  }

  /**
   * Gets the value of the 'twitterMessage' field.
   * @return The value of the 'twitterMessage' field.
   */
  public java.lang.CharSequence getTwitterMessage() {
    return twitterMessage;
  }


  /**
   * Sets the value of the 'twitterMessage' field.
   * @param value the value to set.
   */
  public void setTwitterMessage(java.lang.CharSequence value) {
    this.twitterMessage = value;
  }

  /**
   * Creates a new TwitterEventFeedbackDto RecordBuilder.
   * @return A new TwitterEventFeedbackDto RecordBuilder
   */
  public static myapp.generated.avro.TwitterEventFeedbackDto.Builder newBuilder() {
    return new myapp.generated.avro.TwitterEventFeedbackDto.Builder();
  }

  /**
   * Creates a new TwitterEventFeedbackDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TwitterEventFeedbackDto RecordBuilder
   */
  public static myapp.generated.avro.TwitterEventFeedbackDto.Builder newBuilder(myapp.generated.avro.TwitterEventFeedbackDto.Builder other) {
    if (other == null) {
      return new myapp.generated.avro.TwitterEventFeedbackDto.Builder();
    } else {
      return new myapp.generated.avro.TwitterEventFeedbackDto.Builder(other);
    }
  }

  /**
   * Creates a new TwitterEventFeedbackDto RecordBuilder by copying an existing TwitterEventFeedbackDto instance.
   * @param other The existing instance to copy.
   * @return A new TwitterEventFeedbackDto RecordBuilder
   */
  public static myapp.generated.avro.TwitterEventFeedbackDto.Builder newBuilder(myapp.generated.avro.TwitterEventFeedbackDto other) {
    if (other == null) {
      return new myapp.generated.avro.TwitterEventFeedbackDto.Builder();
    } else {
      return new myapp.generated.avro.TwitterEventFeedbackDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for TwitterEventFeedbackDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwitterEventFeedbackDto>
    implements org.apache.avro.data.RecordBuilder<TwitterEventFeedbackDto> {

    private java.lang.CharSequence eventId;
    private java.lang.CharSequence twitterAccount;
    private java.lang.CharSequence twitterHashTags;
    private java.lang.CharSequence twitterMessage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(myapp.generated.avro.TwitterEventFeedbackDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.twitterAccount)) {
        this.twitterAccount = data().deepCopy(fields()[1].schema(), other.twitterAccount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.twitterHashTags)) {
        this.twitterHashTags = data().deepCopy(fields()[2].schema(), other.twitterHashTags);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.twitterMessage)) {
        this.twitterMessage = data().deepCopy(fields()[3].schema(), other.twitterMessage);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing TwitterEventFeedbackDto instance
     * @param other The existing instance to copy.
     */
    private Builder(myapp.generated.avro.TwitterEventFeedbackDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.twitterAccount)) {
        this.twitterAccount = data().deepCopy(fields()[1].schema(), other.twitterAccount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.twitterHashTags)) {
        this.twitterHashTags = data().deepCopy(fields()[2].schema(), other.twitterHashTags);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.twitterMessage)) {
        this.twitterMessage = data().deepCopy(fields()[3].schema(), other.twitterMessage);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'eventId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventId() {
      return eventId;
    }


    /**
      * Sets the value of the 'eventId' field.
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder setEventId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.eventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventId' field.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder clearEventId() {
      eventId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'twitterAccount' field.
      * @return The value.
      */
    public java.lang.CharSequence getTwitterAccount() {
      return twitterAccount;
    }


    /**
      * Sets the value of the 'twitterAccount' field.
      * @param value The value of 'twitterAccount'.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder setTwitterAccount(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.twitterAccount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'twitterAccount' field has been set.
      * @return True if the 'twitterAccount' field has been set, false otherwise.
      */
    public boolean hasTwitterAccount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'twitterAccount' field.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder clearTwitterAccount() {
      twitterAccount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'twitterHashTags' field.
      * @return The value.
      */
    public java.lang.CharSequence getTwitterHashTags() {
      return twitterHashTags;
    }


    /**
      * Sets the value of the 'twitterHashTags' field.
      * @param value The value of 'twitterHashTags'.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder setTwitterHashTags(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.twitterHashTags = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'twitterHashTags' field has been set.
      * @return True if the 'twitterHashTags' field has been set, false otherwise.
      */
    public boolean hasTwitterHashTags() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'twitterHashTags' field.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder clearTwitterHashTags() {
      twitterHashTags = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'twitterMessage' field.
      * @return The value.
      */
    public java.lang.CharSequence getTwitterMessage() {
      return twitterMessage;
    }


    /**
      * Sets the value of the 'twitterMessage' field.
      * @param value The value of 'twitterMessage'.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder setTwitterMessage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.twitterMessage = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'twitterMessage' field has been set.
      * @return True if the 'twitterMessage' field has been set, false otherwise.
      */
    public boolean hasTwitterMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'twitterMessage' field.
      * @return This builder.
      */
    public myapp.generated.avro.TwitterEventFeedbackDto.Builder clearTwitterMessage() {
      twitterMessage = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TwitterEventFeedbackDto build() {
      try {
        TwitterEventFeedbackDto record = new TwitterEventFeedbackDto();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.twitterAccount = fieldSetFlags()[1] ? this.twitterAccount : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.twitterHashTags = fieldSetFlags()[2] ? this.twitterHashTags : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.twitterMessage = fieldSetFlags()[3] ? this.twitterMessage : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TwitterEventFeedbackDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<TwitterEventFeedbackDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TwitterEventFeedbackDto>
    READER$ = (org.apache.avro.io.DatumReader<TwitterEventFeedbackDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.eventId);

    out.writeString(this.twitterAccount);

    out.writeString(this.twitterHashTags);

    out.writeString(this.twitterMessage);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);

      this.twitterAccount = in.readString(this.twitterAccount instanceof Utf8 ? (Utf8)this.twitterAccount : null);

      this.twitterHashTags = in.readString(this.twitterHashTags instanceof Utf8 ? (Utf8)this.twitterHashTags : null);

      this.twitterMessage = in.readString(this.twitterMessage instanceof Utf8 ? (Utf8)this.twitterMessage : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);
          break;

        case 1:
          this.twitterAccount = in.readString(this.twitterAccount instanceof Utf8 ? (Utf8)this.twitterAccount : null);
          break;

        case 2:
          this.twitterHashTags = in.readString(this.twitterHashTags instanceof Utf8 ? (Utf8)this.twitterHashTags : null);
          break;

        case 3:
          this.twitterMessage = in.readString(this.twitterMessage instanceof Utf8 ? (Utf8)this.twitterMessage : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










