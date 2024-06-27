package com.masai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Series;
import com.masai.repository.SeriesDAO;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesDAO seriesDAO;

    public List<Series> getAllSeries() {
        return seriesDAO.getAllSeries();
    }

    public Series getSeriesById(Long id) {
        return seriesDAO.getSeriesById(id);
    }

    public void addSeries(Series series) {
        seriesDAO.addSeries(series);
    }

    public void updateSeries(Series updatedSeries) {
        seriesDAO.updateSeries(updatedSeries);
    }

    public void deleteSeries(Long id) {
        seriesDAO.deleteSeries(id);
    }
}
