package com.example.industrialstructurecasestudy.ui.board;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00061"}, d2 = {"Lcom/example/industrialstructurecasestudy/ui/board/ViewBoardsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/industrialstructurecasestudy/databinding/FragmentViewBoardsBinding;", "args", "Lcom/example/industrialstructurecasestudy/ui/board/ViewBoardsFragmentArgs;", "getArgs", "()Lcom/example/industrialstructurecasestudy/ui/board/ViewBoardsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/example/industrialstructurecasestudy/databinding/FragmentViewBoardsBinding;", "boardrepository", "Lcom/example/industrialstructurecasestudy/repository/RemoteBoardRepository;", "getBoardrepository", "()Lcom/example/industrialstructurecasestudy/repository/RemoteBoardRepository;", "setBoardrepository", "(Lcom/example/industrialstructurecasestudy/repository/RemoteBoardRepository;)V", "crviewModel", "Lcom/example/industrialstructurecasestudy/ui/board/CreateBoardViewModel;", "getCrviewModel", "()Lcom/example/industrialstructurecasestudy/ui/board/CreateBoardViewModel;", "crviewModel$delegate", "Lkotlin/Lazy;", "scp", "Lkotlinx/coroutines/CoroutineScope;", "vm", "Lcom/example/industrialstructurecasestudy/ui/board/BoardViewModel;", "getVm", "()Lcom/example/industrialstructurecasestudy/ui/board/BoardViewModel;", "vm$delegate", "fetchBoardsFromServer", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "performDeleteOperation", "displayName", "", "id", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ViewBoardsFragment extends androidx.fragment.app.Fragment {
    private final kotlinx.coroutines.CoroutineScope scp = null;
    @javax.inject.Inject()
    public com.example.industrialstructurecasestudy.repository.RemoteBoardRepository boardrepository;
    private com.example.industrialstructurecasestudy.databinding.FragmentViewBoardsBinding _binding;
    private final kotlin.Lazy vm$delegate = null;
    private final kotlin.Lazy crviewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public ViewBoardsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.repository.RemoteBoardRepository getBoardrepository() {
        return null;
    }
    
    public final void setBoardrepository(@org.jetbrains.annotations.NotNull()
    com.example.industrialstructurecasestudy.repository.RemoteBoardRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.industrialstructurecasestudy.databinding.FragmentViewBoardsBinding getBinding() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.board.BoardViewModel getVm() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.board.CreateBoardViewModel getCrviewModel() {
        return null;
    }
    
    private final com.example.industrialstructurecasestudy.ui.board.ViewBoardsFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    private final void fetchBoardsFromServer() {
    }
    
    private final void performDeleteOperation(java.lang.String displayName, java.lang.String id) {
    }
}