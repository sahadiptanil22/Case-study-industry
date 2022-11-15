package com.example.industrialstructurecasestudy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J \u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002J\u001a\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020+2\u0006\u00103\u001a\u000204H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00065"}, d2 = {"Lcom/example/industrialstructurecasestudy/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/industrialstructurecasestudy/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/industrialstructurecasestudy/databinding/FragmentHomeBinding;", "observer", "Landroidx/lifecycle/Observer;", "Lcom/example/industrialstructurecasestudy/adopter/RecyclerItemOperation;", "repository", "Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;", "getRepository", "()Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;", "setRepository", "(Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;)V", "scp", "Lkotlinx/coroutines/CoroutineScope;", "viewModel", "Lcom/example/industrialstructurecasestudy/ui/CreateOrganizationViewModel;", "getViewModel", "()Lcom/example/industrialstructurecasestudy/ui/CreateOrganizationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "vm", "Lcom/example/industrialstructurecasestudy/ui/HomeViewModel;", "getVm", "()Lcom/example/industrialstructurecasestudy/ui/HomeViewModel;", "vm$delegate", "fetchOrganizationsFromServer", "", "initRecycler", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUpdateWorkspace", "id", "", "nm", "desc", "onViewCreated", "view", "performUpdateOperation", "showDeleteDialog", "displayName", "organization", "Lcom/example/industrialstructurecasestudy/domain/Organization;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final kotlinx.coroutines.CoroutineScope scp = null;
    @javax.inject.Inject()
    public com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository repository;
    private com.example.industrialstructurecasestudy.databinding.FragmentHomeBinding _binding;
    private final kotlin.Lazy vm$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.lifecycle.Observer<com.example.industrialstructurecasestudy.adopter.RecyclerItemOperation> observer;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository p0) {
    }
    
    private final com.example.industrialstructurecasestudy.ui.HomeViewModel getVm() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.CreateOrganizationViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecycler() {
    }
    
    private final void fetchOrganizationsFromServer() {
    }
    
    private final void showDeleteDialog(java.lang.String displayName, com.example.industrialstructurecasestudy.domain.Organization organization) {
    }
    
    private final void onUpdateWorkspace(java.lang.String id, java.lang.String nm, java.lang.String desc) {
    }
    
    private final void performUpdateOperation(java.lang.String id) {
    }
}