package com.masai.repository;

import org.springframework.stereotype.Repository;

import com.masai.model.Series;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeriesDAO {

    private List<Series> seriesList = new ArrayList<>();

    // Initialize with sample hardcoded data
    public void init() {
        seriesList.add(new Series(1L, "Breaking Bad", "Drama", 5));
        seriesList.add(new Series(2L, "Stranger Things", "Sci-Fi", 4));
        seriesList.add(new Series(3L, "The Crown", "Drama", 4));
    }

    public List<Series> getAllSeries() {
        return seriesList;
    }

    public Series getSeriesById(Long id) {
        return seriesList.stream()
                .filter(series -> series.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addSeries(Series series) {
        seriesList.add(series);
    }

    public void updateSeries(Series updatedSeries) {
        seriesList.removeIf(series -> series.getId().equals(updatedSeries.getId()));
        seriesList.add(updatedSeries);
    }

    public void deleteSeries(Long id) {
        seriesList.removeIf(series -> series.getId().equals(id));
    }
}
