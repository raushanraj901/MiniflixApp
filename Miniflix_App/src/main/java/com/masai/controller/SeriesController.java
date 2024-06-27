package com.masai.controller;
import com.masai.model.Series;
import com.masai.services.SeriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @GetMapping("/")
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Series getSeriesById(@PathVariable Long id) {
        return seriesService.getSeriesById(id);
    }

    @PostMapping("/")
    public void addSeries(@RequestBody Series series) {
        seriesService.addSeries(series);
    }

    @PutMapping("/")
    public void updateSeries(@RequestBody Series updatedSeries) {
        seriesService.updateSeries(updatedSeries);
    }

    @DeleteMapping("/{id}")
    public void deleteSeries(@PathVariable Long id) {
        seriesService.deleteSeries(id);
    }
}

