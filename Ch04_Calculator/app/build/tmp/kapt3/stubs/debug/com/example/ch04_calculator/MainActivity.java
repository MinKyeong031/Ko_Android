package com.example.ch04_calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010\'\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020#H\u0002J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020#H\u0002J\u000e\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001d\u0010\f\u00a8\u00060"}, d2 = {"Lcom/example/ch04_calculator/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "db", "Lcom/example/ch04_calculator/AppDatabase;", "getDb", "()Lcom/example/ch04_calculator/AppDatabase;", "setDb", "(Lcom/example/ch04_calculator/AppDatabase;)V", "expressionTextView", "Landroid/widget/TextView;", "getExpressionTextView", "()Landroid/widget/TextView;", "expressionTextView$delegate", "Lkotlin/Lazy;", "hasOperator", "", "historyLayout", "Landroid/view/View;", "getHistoryLayout", "()Landroid/view/View;", "historyLayout$delegate", "historyLinearLayout", "Landroid/widget/LinearLayout;", "getHistoryLinearLayout", "()Landroid/widget/LinearLayout;", "historyLinearLayout$delegate", "isOperator", "resultTextView", "getResultTextView", "resultTextView$delegate", "buttonClicked", "", "v", "calculateExpression", "", "clearButtonClicked", "closeHistoryButtonClicked", "historyButtonClicked", "historyClearButtonClicked", "numberButtonClicked", "number", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "operatorButtonClicked", "operator", "resultButtonClicked", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy expressionTextView$delegate = null;
    private final kotlin.Lazy resultTextView$delegate = null;
    private final kotlin.Lazy historyLayout$delegate = null;
    private final kotlin.Lazy historyLinearLayout$delegate = null;
    public com.example.ch04_calculator.AppDatabase db;
    private boolean isOperator = false;
    private boolean hasOperator = false;
    
    public MainActivity() {
        super();
    }
    
    private final android.widget.TextView getExpressionTextView() {
        return null;
    }
    
    private final android.widget.TextView getResultTextView() {
        return null;
    }
    
    private final android.view.View getHistoryLayout() {
        return null;
    }
    
    private final android.widget.LinearLayout getHistoryLinearLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ch04_calculator.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.example.ch04_calculator.AppDatabase p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void buttonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void numberButtonClicked(java.lang.String number) {
    }
    
    private final void operatorButtonClicked(java.lang.String operator) {
    }
    
    public final void resultButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateExpression() {
        return null;
    }
    
    public final void clearButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void historyButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void closeHistoryButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void historyClearButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
}