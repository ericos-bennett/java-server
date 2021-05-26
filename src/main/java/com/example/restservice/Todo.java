package com.example.restservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String task;
  private boolean isCompleted;

	public Todo(String task, boolean isCompleted) {
		this.task = task;
    this.isCompleted = isCompleted;
	}

  public Todo(int id, String task, boolean isCompleted) {
    this.setId(id);
		this.setTask(task);
    this.setIsCompleted(isCompleted);
	}

	public int getId() {
		return id;
	}

  public void setId(int id) {
    this.id = id;
  }

	public String getTask() {
		return task;
	}

  public void setTask(String task) {
    this.task = task;
  }

  public boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(boolean isCompleted) {
    this.isCompleted = isCompleted;
  }
}