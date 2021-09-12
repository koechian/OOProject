package com.example.application.views.tasks;

import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;

@PageTitle("Tasks")
@Route(value = "empty1", layout = MainLayout.class)
public class TasksView extends Div implements AfterNavigationObserver {
        Button addButton = new Button("Add");

        Grid<Tasks> grid = new Grid<>();

        public TasksView() {
                addClassName("tasks-view");
                setSizeFull();
                grid.setHeight("100%");
                grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
                grid.addComponentColumn(person -> createCard(person));
                add(grid);
        }

        private HorizontalLayout createCard(Tasks person) {
                HorizontalLayout card = new HorizontalLayout();
                card.addClassName("card");
                card.setSpacing(false);
                card.getThemeList().add("spacing-s");

                VerticalLayout description = new VerticalLayout();
                description.addClassName("description");
                description.setSpacing(false);
                description.setPadding(false);

                HorizontalLayout header = new HorizontalLayout();
                header.addClassName("header");
                header.setSpacing(false);
                header.getThemeList().add("spacing-s");

                Span unit = new Span(person.getUnit());
                unit.addClassName("unit");
                Span date = new Span(person.getDate());
                date.addClassName("date");
                header.add(unit, date);

                Span task = new Span(person.getTask());
                task.addClassName("post");

                HorizontalLayout actions = new HorizontalLayout();
                actions.addClassName("actions");
                actions.setSpacing(false);
                actions.getThemeList().add("spacing-s");

                Icon likeIcon = VaadinIcon.HEART.create();
                likeIcon.addClassName("icon");
                Span likes = new Span(String.valueOf(person.getDone()));
                likes.addClassName("likes");

                actions.add(likeIcon, likes);

                description.add(header, task, actions);
                card.add(description);
                return card;
        }

        @Override
        public void afterNavigation(AfterNavigationEvent event) {

                // Set some data when this view is displayed.
                List<Tasks> tasks = Arrays.asList( //
                                createTask("OOP", "May 8", "Read for exams", "N0T DONE"),
                                createTask("OOP", "Sep 13", "Complete project", "DONE"),

                                createTask("COA", "May 3", "GROUP WORK", "NOT DONE"), createTask("DSA", "May 3",

                                                "PROJECT", "DONE"),
                                createTask("World Civ", "Apr 22",

                                                "ASSIGNMENT", "NOT DONE"),
                                createTask("Ethics", "Sep 21",

                                                "Pick papers", "NOT DONE"),
                                createTask("Digital Logic", "Nov 17",

                                                "Special exams", "NOT DONE")

                );

                grid.setItems(tasks);
        }

        private static Tasks createTask(String unit, String date, String task, String done) {
                Tasks p = new Tasks();

                p.setUnit(unit);
                p.setDate(date);
                p.setTask(task);
                p.setDone(done);

                return p;
        }

}
