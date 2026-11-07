package com.proxyrack.control.ui.screens;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.navigation.NavController;
import com.proxyrack.control.R;
import com.proxyrack.control.core.util.TestTags;
import com.proxyrack.control.ui.navigation.Screen;
import com.proxyrack.control.domain.ConnectionStatus;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a$\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007\u001a\u0016\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007\u001a\b\u0010\u001d\u001a\u00020\u000eH\u0007\u001a\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u001bH\u0007\u001a$\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\"H\u0007\u001a\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0012\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\"H\u0007\u001ad\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0)2\b\b\u0002\u0010!\u001a\u00020\"2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0+2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020.H\u0007\u001a\u0013\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0018\u00a2\u0006\u0002\u00101\u001a\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0018\u001a\u000e\u00105\u001a\u0002032\u0006\u00104\u001a\u00020\u0018\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0011\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0003\u00a8\u00066"}, d2 = {"deviceIdRegex", "Lkotlin/text/Regex;", "getDeviceIdRegex", "()Lkotlin/text/Regex;", "purple", "Landroidx/compose/ui/graphics/Color;", "getPurple", "()J", "setPurple-8_81llA", "(J)V", "J", "usernameRegex", "getUsernameRegex", "Header", "", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/proxyrack/control/ui/screens/HomeViewModel;", "HomeScreen", "IPRotationRow", "LogsBottomSheet", "logMessages", "", "", "showBottomSheet", "Landroidx/compose/runtime/MutableState;", "", "LogsButton", "QuestionMarkCircleButton", "RotateIPButton", "enabled", "RotationTimeDropdown", "modifier", "Landroidx/compose/ui/Modifier;", "SettingsIconButton", "SetupInstructionsLink", "StyledTextField", "label", "value", "onValueChange", "Lkotlin/Function1;", "onDone", "Lkotlin/Function0;", "isError", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "colorFromHex", "hex", "(Ljava/lang/String;)J", "deviceIdValidator", "Lcom/proxyrack/control/ui/screens/ValidationResult;", "text", "usernameValidator", "app_release"})
public final class HomeScreenKt {
    private static long purple;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex usernameRegex = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex deviceIdRegex = null;
    
    public static final long getPurple() {
        return 0L;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.ui.screens.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IPRotationRow(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.ui.screens.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QuestionMarkCircleButton() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RotateIPButton(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.ui.screens.HomeViewModel viewModel, boolean enabled) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void RotationTimeDropdown(@org.jetbrains.annotations.NotNull()
    com.proxyrack.control.ui.screens.HomeViewModel viewModel, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Header(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.proxyrack.control.ui.screens.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SettingsIconButton(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SetupInstructionsLink(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LogsButton(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.Boolean> showBottomSheet) {
    }
    
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void LogsBottomSheet(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> logMessages, @org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<java.lang.Boolean> showBottomSheet) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StyledTextField(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDone, boolean enabled, boolean isError, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.text.Regex getUsernameRegex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.proxyrack.control.ui.screens.ValidationResult usernameValidator(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.text.Regex getDeviceIdRegex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.proxyrack.control.ui.screens.ValidationResult deviceIdValidator(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    public static final long colorFromHex(@org.jetbrains.annotations.NotNull()
    java.lang.String hex) {
        return 0L;
    }
}