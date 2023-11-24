package org.max.commerce.tenant;

import com.mybatisflex.core.tenant.TenantFactory;
import org.apache.commons.lang3.StringUtils;
import org.max.commerce.common.MyConstants;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class MyTenantFactory implements TenantFactory {

    public Object[] getTenantIds(){
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        Object tenantId = attributes.getAttribute(MyConstants.TENANT_ID_KEY, RequestAttributes.SCOPE_REQUEST);
        if (tenantId == null || !StringUtils.isNumeric(tenantId.toString())) {
            return new Object[]{MyConstants.DEFAULT_TENANT_ID};
        }
        return new Object[]{tenantId};
    }
}
