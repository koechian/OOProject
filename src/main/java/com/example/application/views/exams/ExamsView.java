package com.example.application.views.exams;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;

@PageTitle("Exams ")
@Route(value = "empty", layout = MainLayout.class)
public class ExamsView extends Div {

    public ExamsView() {
        addClassName("exams-view");
        add(new Text("Content placeholder"));
    }

}
