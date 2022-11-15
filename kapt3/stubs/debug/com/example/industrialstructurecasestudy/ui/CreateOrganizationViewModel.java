package com.example.industrialstructurecasestudy.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/industrialstructurecasestudy/ui/CreateOrganizationViewModel;", "Landroidx/lifecycle/ViewModel;", "localOrganizationRepository", "Lcom/example/industrialstructurecasestudy/repository/LocalOrganizationRepository;", "remoteOrganizationRepository", "Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;", "(Lcom/example/industrialstructurecasestudy/repository/LocalOrganizationRepository;Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;)V", "_isProcessing", "Landroidx/lifecycle/MutableLiveData;", "", "_organization", "Lcom/example/industrialstructurecasestudy/domain/Organization;", "isProcessing", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "organization", "deleteOrganization", "", "org", "onCreateClicked", "onDescChanged", "desc", "", "onNameChanged", "str", "app_debug"})
public final class CreateOrganizationViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.industrialstructurecasestudy.repository.LocalOrganizationRepository localOrganizationRepository = null;
    private final com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository remoteOrganizationRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isProcessing = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isProcessing = null;
    private final androidx.lifecycle.MutableLiveData<com.example.industrialstructurecasestudy.domain.Organization> _organization = null;
    private final androidx.lifecycle.LiveData<com.example.industrialstructurecasestudy.domain.Organization> organization = null;
    
    @javax.inject.Inject()
    public CreateOrganizationViewModel(@org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.repository.LocalOrganizationRepository localOrganizationRepository, @org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository remoteOrganizationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isProcessing() {
        return null;
    }
    
    public final void onNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void onDescChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
    
    public final void onCreateClicked() {
    }
    
    public final void deleteOrganization(@org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.domain.Organization org) {
    }
}