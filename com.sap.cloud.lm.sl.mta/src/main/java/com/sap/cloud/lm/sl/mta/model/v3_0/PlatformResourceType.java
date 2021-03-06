package com.sap.cloud.lm.sl.mta.model.v3_0;

import static com.sap.cloud.lm.sl.common.util.CommonUtil.getOrDefault;

import java.util.Collections;

public class PlatformResourceType extends com.sap.cloud.lm.sl.mta.model.v2_0.PlatformResourceType {

    protected PlatformResourceType() {

    }

    public static class PlatformResourceTypeBuilder
        extends com.sap.cloud.lm.sl.mta.model.v2_0.PlatformResourceType.PlatformResourceTypeBuilder {

        @Override
        public PlatformResourceType build() {
            PlatformResourceType result = new PlatformResourceType();
            result.setName(name);
            result.setParameters(getOrDefault(parameters, Collections.<String, Object> emptyMap()));
            return result;
        }

    }

}
