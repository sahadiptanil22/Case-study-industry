// Generated by Dagger (https://dagger.dev).
package com.example.industrialstructurecasestudy.ui.board;

import com.example.industrialstructurecasestudy.repository.RemoteOrganizationRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CreateBoardFragment_MembersInjector implements MembersInjector<CreateBoardFragment> {
  private final Provider<RemoteOrganizationRepository> repositoryProvider;

  public CreateBoardFragment_MembersInjector(
      Provider<RemoteOrganizationRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<CreateBoardFragment> create(
      Provider<RemoteOrganizationRepository> repositoryProvider) {
    return new CreateBoardFragment_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(CreateBoardFragment instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.industrialstructurecasestudy.ui.board.CreateBoardFragment.repository")
  public static void injectRepository(CreateBoardFragment instance,
      RemoteOrganizationRepository repository) {
    instance.repository = repository;
  }
}
