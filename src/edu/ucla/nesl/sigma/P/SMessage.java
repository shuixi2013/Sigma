// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: sigma/proto/P.proto
package edu.ucla.nesl.sigma.P;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class SMessage extends Message {

  public static final Type DEFAULT_TYPE = Type.REQUEST;
  public static final String DEFAULT_ERROR = "";

  @ProtoField(tag = 1, type = ENUM, label = REQUIRED)
  public final Type type;

  @ProtoField(tag = 2)
  public final SRequest request;

  @ProtoField(tag = 3)
  public final SResponse response;

  @ProtoField(tag = 4, type = STRING)
  public final String error;

  private SMessage(Builder builder) {
    super(builder);
    this.type = builder.type;
    this.request = builder.request;
    this.response = builder.response;
    this.error = builder.error;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof SMessage)) {
      return false;
    }
    SMessage o = (SMessage) other;
    return equals(type, o.type)
           && equals(request, o.request)
           && equals(response, o.response)
           && equals(error, o.error);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = type != null ? type.hashCode() : 0;
      result = result * 37 + (request != null ? request.hashCode() : 0);
      result = result * 37 + (response != null ? response.hashCode() : 0);
      result = result * 37 + (error != null ? error.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SMessage> {

    public Type type;
    public SRequest request;
    public SResponse response;
    public String error;

    public Builder() {
    }

    public Builder(SMessage message) {
      super(message);
      if (message == null) {
        return;
      }
      this.type = message.type;
      this.request = message.request;
      this.response = message.response;
      this.error = message.error;
    }

    public Builder type(Type type) {
      this.type = type;
      return this;
    }

    public Builder request(SRequest request) {
      this.request = request;
      return this;
    }

    public Builder response(SResponse response) {
      this.response = response;
      return this;
    }

    public Builder error(String error) {
      this.error = error;
      return this;
    }

    @Override
    public SMessage build() {
      checkRequiredFields();
      return new SMessage(this);
    }
  }

  public enum Type {
    @ProtoEnum(0)
    REQUEST,
    @ProtoEnum(1)
    RESPONSE,
    @ProtoEnum(2)
    ERROR,
  }
}
