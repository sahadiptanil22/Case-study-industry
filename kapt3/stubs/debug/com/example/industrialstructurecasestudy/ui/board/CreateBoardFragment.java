package com.example.industrialstructurecasestudy.ui.board;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\u001a\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/industrialstructurecasestudy/ui/board/CreateBoardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/industrialstructurecasestudy/databinding/FragmentCreateBoardBinding;", "binding", "getBinding", "()Lcom/example/industrialstructurecasestudy/databinding/FragmentCreateBoardBinding;", "boardviewModel", "Lcom/example/industrialstructurecasestudy/ui/board/CreateBoardViewModel;", "getBoardviewModel", "()Lcom/example/industrialstructurecasestudy/ui/board/CreateBoardViewModel;", "boardviewModel$delegate", "Lkotlin/Lazy;", "orgviewModel", "Lcom/example/industrialstructurecasestudy/ui/CreateOrganizationViewModel;", "getOrgviewModel", "()Lcom/example/industrialstructurecasestudy/ui/CreateOrganizationViewModel;", "orgviewModel$delegate", "repository", "Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;", "getRepository", "()Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;", "setRepository", "(Lcom/example/industrialstructurecasestudy/repository/RemoteOrganizationRepository;)V", "scp", "Lkotlinx/coroutines/CoroutineScope;", "displayWorkspaceSpinner", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CreateBoardFragment extends androidx.fragment.app.Fragment {
    private com.example.industrialstructurecasestudy.databinding.FragmentCreateBoardBinding _binding;
    private final kotlinx.coroutines.CoroutineScope scp = null;
    @javax.inject.Inject()
    public com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository repository;
    private final kotlin.Lazy boardviewModel$delegate = null;
    private final kotlin.Lazy orgviewModel$delegate = null;
    
    public CreateBoardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.databinding.FragmentCreateBoardBinding getBinding() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.board.CreateBoardViewModel getBoardviewModel() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.CreateOrganizationViewModel getOrgviewModel() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void displayWorkspaceSpinner() {
    }
}