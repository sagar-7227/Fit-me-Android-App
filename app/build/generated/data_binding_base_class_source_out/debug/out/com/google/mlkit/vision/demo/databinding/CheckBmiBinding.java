// Generated by view binder compiler. Do not edit!
package com.google.mlkit.vision.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.mlkit.vision.demo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CheckBmiBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView CheckBmi;

  @NonNull
  public final Button calculate;

  @NonNull
  public final EditText editTextHeight;

  @NonNull
  public final EditText editTextWeight;

  @NonNull
  public final ImageView imageView4;

  private CheckBmiBinding(@NonNull ConstraintLayout rootView, @NonNull TextView CheckBmi,
      @NonNull Button calculate, @NonNull EditText editTextHeight, @NonNull EditText editTextWeight,
      @NonNull ImageView imageView4) {
    this.rootView = rootView;
    this.CheckBmi = CheckBmi;
    this.calculate = calculate;
    this.editTextHeight = editTextHeight;
    this.editTextWeight = editTextWeight;
    this.imageView4 = imageView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CheckBmiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CheckBmiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.check_bmi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CheckBmiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Check_bmi;
      TextView CheckBmi = ViewBindings.findChildViewById(rootView, id);
      if (CheckBmi == null) {
        break missingId;
      }

      id = R.id.calculate;
      Button calculate = ViewBindings.findChildViewById(rootView, id);
      if (calculate == null) {
        break missingId;
      }

      id = R.id.editTextHeight;
      EditText editTextHeight = ViewBindings.findChildViewById(rootView, id);
      if (editTextHeight == null) {
        break missingId;
      }

      id = R.id.editTextWeight;
      EditText editTextWeight = ViewBindings.findChildViewById(rootView, id);
      if (editTextWeight == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      return new CheckBmiBinding((ConstraintLayout) rootView, CheckBmi, calculate, editTextHeight,
          editTextWeight, imageView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}