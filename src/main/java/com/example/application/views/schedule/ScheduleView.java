package com.example.application.views.schedule;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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

        List<ScheduleView> mondayTimetable = new ArrayList<>();

        mondayTimetable.add(new ScheduleView(1, "Web Dev", "2 Hours", "0815 Hrs", "1015 hrs"));
        mondayTimetable.add(new ScheduleView(2, "Computer  Architecture", "2 Hours", "1015 Hrs", "1215 Hrs"));
        mondayTimetable.add(new ScheduleView(3, "Ethics", "2 Hours", "1315 Hrs", "1515 Hrs"));
        mondayTimetable.add(new ScheduleView(4, "Digital Logic", "2 Hours", "1515 Hrs", "1715 Hrs"));

        List<ScheduleView> tuesdayTimetable = new ArrayList<>();

        tuesdayTimetable.add(new ScheduleView(1, "German", "1 Hour", "1015 Hrs", "1115 hrs"));
        tuesdayTimetable.add(new ScheduleView(2, "Object Oriented Programming", "2 Hours", "1515 Hrs", "1715 Hrs"));

        List<ScheduleView> wednesdayTimetable = new ArrayList<>();

        wednesdayTimetable.add(new ScheduleView(1, "Web Development", "2 Hours", "0815 Hrs", "1015 hrs"));
        wednesdayTimetable.add(new ScheduleView(2, "Object Oriented Programming", "2 Hours", "1115 Hrs", "1315 Hrs"));
        wednesdayTimetable.add(new ScheduleView(3, "Digital Logic", "2 Hours", "1415 Hrs", "1615 Hrs"));
        wednesdayTimetable.add(new ScheduleView(3, "Principles of Ethics", "1 Hour", "1615 Hrs", "1715 Hrs"));

        List<ScheduleView> thursdayTimetable = new ArrayList<>();

        thursdayTimetable.add(new ScheduleView(1, "Computer Architecture", "1 Hour", "0815 Hrs", "0915 hrs"));
        thursdayTimetable.add(new ScheduleView(2, "Probability and Statistics", "1 Hour", "0915 Hrs", "1015 Hrs"));
        thursdayTimetable
                .add(new ScheduleView(3, "Data Structures and Algorithims", "2 Hours", "1115 Hrs", "1215 Hrs"));
        thursdayTimetable.add(new ScheduleView(3, "German", "2 Hour", "1415 Hrs", "1615 Hrs"));

        List<ScheduleView> fridayTimetable = new ArrayList<>();

        fridayTimetable.add(new ScheduleView(1, "Data Structures and Algorithims", "1 Hour", "0815 Hrs", "0915 hrs"));
        fridayTimetable.add(new ScheduleView(2, "Probability and Statistics", "1 Hour", "0915 Hrs", "1015 Hrs"));

        Grid<ScheduleView> grid = new Grid<>(ScheduleView.class);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String dayWeek = sdf.format(new Date());
        String date = "Current Time: ";

        grid.setColumns("lesson", "duration", "start", "end");

        switch (dayWeek) {
            case "Monday":
                grid.setItems(mondayTimetable);
                break;

            case "Tuesday":
                grid.setItems(tuesdayTimetable);
                break;

            case "Wednesday":
                grid.setItems(wednesdayTimetable);
                break;

            case "Thursday":
                grid.setItems(thursdayTimetable);
                break;

            case "Friday":
                grid.setItems(fridayTimetable);
                break;

        }
        add(grid);

        add(date + dtf.format(now) + " " + dayWeek);
        setClassName(date);

        Button leftButton = new Button("Previous Day", new Icon(VaadinIcon.ARROW_LEFT));

        Button rightButton = new Button("Next Day", new Icon(VaadinIcon.ARROW_RIGHT));
        rightButton.setIconAfterText(true);

        add(leftButton, rightButton);
    }

}
