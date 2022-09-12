// Generated by view binder compiler. Do not edit!
package com.google.mlkit.vision.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class GoogleLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button googleButton;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  private GoogleLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button googleButton,
      @NonNull ImageView imageView, @NonNull TextView textView) {
    this.rootView = rootView;
    this.googleButton = googleButton;
    this.imageView = imageView;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GoogleLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GoogleLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.google_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GoogleLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.google_button;
      Button googleButton = ViewBindings.findChildViewById(rootView, id);
      if (googleButton == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new GoogleLoginBinding((ConstraintLayout) rootView, googleButton, imageView, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
