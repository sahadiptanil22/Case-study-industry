// Generated by Dagger (https://dagger.dev).
package com.example.industrialstructurecasestudy.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CreateOrganizationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CreateOrganizationViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CreateOrganizationViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CreateOrganizationViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CreateOrganizationViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}