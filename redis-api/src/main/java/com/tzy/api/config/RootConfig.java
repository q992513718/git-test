package com.tzy.api.config;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @author tzy
 * @create 2019-09-22 10:30
 */
public class RootConfig implements TransactionManagementConfigurer {
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}
