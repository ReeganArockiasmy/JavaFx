/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceapp;


import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author reegan
 */
public class GetDailySalesService extends Service<ObservableList<DailySales>> {

    /**
     * Create and return the task for fetching the data. Note that this method
     * is called on the background thread (all other code in this application is
     * on the JavaFX Application Thread!).
     *
     * @return A task
     */
    @Override
    protected Task createTask() {
        return new GetDailySalesTask();
    }
}
