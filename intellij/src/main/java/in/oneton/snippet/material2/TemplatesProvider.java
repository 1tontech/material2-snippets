package in.oneton.snippet.material2;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class TemplatesProvider implements DefaultLiveTemplatesProvider {
  public String[] getDefaultLiveTemplateFiles() {
    return new String[] {"material", "covalent", "flex-layout"};
  }

  @Nullable
  public String[] getHiddenLiveTemplateFiles() {
    return null;
  }
}
