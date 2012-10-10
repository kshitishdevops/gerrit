// Copyright (C) 2012 Google
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ${package};

import com.google.inject.AbstractModule;
import com.google.gerrit.extensions.webui.WebUiPlugin;
import com.google.gerrit.extensions.webui.GwtPlugin;

class Module extends AbstractModule {
  @Override
  protected void configure() {
    bind(WebUiPlugin.class).toInstance(new GwtPlugin("hello_gwt_plugins"));
  }
}
