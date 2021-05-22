package com.example.restservice;

public class Todo {

	private final long id;
	private final String task;
  private final boolean isCompleted;

	public Todo(long id, String task, boolean isCompleted) {
		this.id = id;
		this.task = task;
    this.isCompleted = isCompleted;
	}

	public long getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

  public boolean getIsCompleted() {
    return isCompleted;
  }
}