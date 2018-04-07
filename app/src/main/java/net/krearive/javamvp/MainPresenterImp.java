package net.krearive.javamvp;

/**
 * Created by idn on 4/7/2018.
 */

public class MainPresenterImp implements MainPresenter {

    //1 create constructor
    MainView mainView;

    public MainPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    //2 implement MainPresenter
    @Override
    public void hitungLuas(Double alas, Double tinggi) {
        Double luas = alas * tinggi;
        mainView.updateTextHasil(luas);
    }
}
