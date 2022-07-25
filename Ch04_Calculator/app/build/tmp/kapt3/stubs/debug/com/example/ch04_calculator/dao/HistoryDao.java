package com.example.ch04_calculator.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/ch04_calculator/dao/HistoryDao;", "", "deleteAll", "", "getAll", "", "Lcom/example/ch04_calculator/model/History;", "insertHistory", "history", "app_debug"})
public abstract interface HistoryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM history")
    public abstract java.util.List<com.example.ch04_calculator.model.History> getAll();
    
    @androidx.room.Insert()
    public abstract void insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.ch04_calculator.model.History history);
    
    @androidx.room.Query(value = "DELETE FROM history")
    public abstract void deleteAll();
}