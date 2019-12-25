package com.zmn.erp.persistence;

import com.zmn.erp.model.LedgerOtherExpenses;
import java.util.List;

public interface LedgerOtherExpensesMapper {
    int deleteByPrimaryKey(Long serialId);

    int insert(LedgerOtherExpenses record);

    LedgerOtherExpenses selectByPrimaryKey(Long serialId);

    List<LedgerOtherExpenses> selectAll();

    int updateByPrimaryKey(LedgerOtherExpenses record);
}