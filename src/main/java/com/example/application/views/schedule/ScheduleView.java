package com.example.application.views.schedule;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Schedule ")
@Route(value = "about", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ScheduleView extends Div {

    public ScheduleView() {
        addClassName("schedule-view");
        add(new Text("Content placeholder"));
    }

}
