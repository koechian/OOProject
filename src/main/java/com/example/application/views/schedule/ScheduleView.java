package com.example.application.views.schedule;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

import java.util.ArrayList;
import java.util.List;

import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Schedule ")
@Route(value = "about", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ScheduleView extends Div {

    private int id;
    private String lessonName;
    private String duration;
    private String startTime;
    private String endTime;

    public ScheduleView(int id, String lessonName, String duration, String startTime, String endTime) {
        super();
        this.id = id;
        this.lessonName = lessonName;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getIndex() {
        return id;
    }

    public String getLesson() {
        return lessonName;
    }

    public String getDuration() {
        return duration;
    }

    public String getStart() {
        return startTime;
    }

    public String getEnd() {
        return endTime;
    }

    public ScheduleView() {
        addClassName("schedule-view");

        List<ScheduleView> timetable = new ArrayList<>();

        timetable.add(new ScheduleView(1, "Web Dev", "2 Hours", "0815 Hrs", "1015 hrs"));
        timetable.add(new ScheduleView(2, "Computer  Architecture", "2 Hours", "1015 Hrs", "1215 Hrs"));
        timetable.add(new ScheduleView(3, "Ethics", "2 Hours", "1315 Hrs", "1515 Hrs"));
        timetable.add(new ScheduleView(4, "Digital Logic", "2 Hours", "1515 Hrs", "1715 Hrs"));

        Grid<ScheduleView> grid = new Grid<>(ScheduleView.class);
        grid.setItems(timetable);
        // grid.removeColumnByKey("id");
        grid.setColumns("lesson", "duration", "start", "end");

        add(grid);
    }

}
