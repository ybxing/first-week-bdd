package bdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class Backlog {
	 private HashMap<String,Task> taskMap ;
	    public Backlog() {
	        taskMap = new HashMap<String,Task>() ;
	    }
	    public Task add(String taskName) {
	        Task newTask = new Task(taskName) ;
	        taskMap.put(taskName,newTask) ;
	        return newTask ;
	    }
	    public Task getTask(String taskName) {
	        Task task = taskMap.get(taskName) ;
	        return task ;
	    }
	    public Task setTaskStatus(String taskName, String status) {
	        Task task = getTask(taskName) ;
	        task.setStatus(status);
	        return task ;
	    }
	    public List getUnompleteTask() {
	        List uncompletedTasks = new ArrayList<Task>() ;
	        for(Entry<String,Task> entry : taskMap.entrySet()) {
	            Task task = entry.getValue() ;
	            if(!task.getStatus().equals(Task.STATUS_DONE)) {
	                uncompletedTasks.add(task) ;
	            }
	        }
	        return uncompletedTasks ;
	    }
}
