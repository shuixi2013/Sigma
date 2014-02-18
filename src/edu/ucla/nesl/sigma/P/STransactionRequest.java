// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/P.proto
package edu.ucla.nesl.sigma.P;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class STransactionRequest extends Message {

    public static final Integer DEFAULT_CODE = 0;
    public static final Integer DEFAULT_FLAGS = 0;

    @ProtoField(tag = 1, label = REQUIRED)
    public final SParcel data;

    @ProtoField(tag = 2, type = INT32, label = REQUIRED)
    public final Integer code;

    @ProtoField(tag = 3, type = INT32, label = REQUIRED)
    public final Integer flags;

    private STransactionRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.code = builder.code;
        this.flags = builder.flags;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof STransactionRequest)) return false;
        STransactionRequest o = (STransactionRequest) other;
        return equals(data, o.data)
                && equals(code, o.code)
                && equals(flags, o.flags);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = data != null ? data.hashCode() : 0;
            result = result * 37 + (code != null ? code.hashCode() : 0);
            result = result * 37 + (flags != null ? flags.hashCode() : 0);
            hashCode = result;
        }
        return result;
    }

    public static final class Builder extends Message.Builder<STransactionRequest> {

        public SParcel data;
        public Integer code;
        public Integer flags;

        public Builder() {
        }

        public Builder(STransactionRequest message) {
            super(message);
            if (message == null) return;
            this.data = message.data;
            this.code = message.code;
            this.flags = message.flags;
        }

        public Builder data(SParcel data) {
            this.data = data;
            return this;
        }

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Builder flags(Integer flags) {
            this.flags = flags;
            return this;
        }

        @Override
        public STransactionRequest build() {
            checkRequiredFields();
            return new STransactionRequest(this);
        }
    }
}
