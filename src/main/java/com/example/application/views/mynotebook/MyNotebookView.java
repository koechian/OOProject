package com.example.application.views.mynotebook;

import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("My Notebook")
@Route(value = "editor", layout = MainLayout.class)
@Tag("my-notebook-view")
@JsModule("./views/mynotebook/my-notebook-view.ts")
public class MyNotebookView extends LitTemplate implements HasStyle {

    @Id
    public RichTextEditor editor;

    public MyNotebookView() {
        addClassNames("block", "h-full");
        editor.setValue(
                "[{\"insert\":\"Welcome to our OOP Group Project\"},{\"attributes\":{\"header\":2},\"insert\":\"\\n\"},{\"insert\":\"This is a text editor that enables students to take notes while online \"},{\"insert\":\".\\nIt handles the following formatting:\\n\"},{\"attributes\":{\"bold\":true},\"insert\":\"Bold\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"italic\":true},\"insert\":\"Italic\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"underline\":true},\"insert\":\"Underline\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"strike\":true},\"insert\":\"Strike-through\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"insert\":\"Headings (H1, H2, H3)\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"insert\":\"Lists (ordered and unordered)\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"insert\":\"Text align (left, center, right)\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"script\":\"sub\"},\"insert\":\"Sub\"},{\"insert\":\"script and \"},{\"attributes\":{\"script\":\"super\"},\"insert\":\"super\"},{\"insert\":\"script\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"link\":\"https://vaadin.com\"},\"insert\":\"Hyperlink\"},{\"attributes\":{\"list\":\"bullet\"},\"insert\":\"\\n\"},{\"attributes\":{\"header\":3},\"insert\":\"\\n\"},{\"insert\":\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\"},{\"attributes\":{\"blockquote\":true},\"insert\":\"\\n\"},{\"insert\":\"Code blocks\"},{\"attributes\":{\"header\":3},\"insert\":\"\\n\"},{\"insert\":\" public static void main(String[] args) {\"},{\"attributes\":{\"code-block\":true},\"insert\":\"\\n\"},{\"insert\":\"  System.Out.print('Hello World');\"},{\"attributes\":{\"code-block\":true},\"insert\":\"\\n\"},{\"insert\":\"}\"},{\"attributes\":{\"code-block\":true},\"insert\":\"\\n\"},{\"insert\":\"\\n\"}]");
    }
}
