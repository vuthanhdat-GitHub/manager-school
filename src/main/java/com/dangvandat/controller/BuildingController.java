package com.dangvandat.controller;

import com.dangvandat.builder.BuildingSearchBuilder;
/*import com.dangvandat.dto.BuildingDTO;
import com.dangvandat.service.IBuildingService;*/
import com.dangvandat.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "buildingControllerOfAdmin")
public class BuildingController {

    /*@Autowired
    private IBuildingService buildingService;

    @RequestMapping(value = "/admin/building/list" , method = RequestMethod.GET)
    public ModelAndView showBuilding(@ModelAttribute("model") BuildingDTO model){
        ModelAndView mdelAndView = new ModelAndView("admin/building/list");
        BuildingSearchBuilder builder = initBuildingBuider(model);
        Pageable pageable = new PageRequest(model.getPage() - 1 , model.getMaxPageItem());
        model.setListResult(buildingService.findAll(builder , pageable));
        mdelAndView.addObject("districts" , DataUtil.getDistrict());
        mdelAndView.addObject("buildingTypes" , DataUtil.getBuildingType());
        mdelAndView.addObject("model" , model);
        return mdelAndView;
    }

    @RequestMapping(value = "/admin/building/edit" , method = RequestMethod.GET)
    public ModelAndView editBuilding(@RequestParam(value = "id" , required = false) Long id){
        ModelAndView mdelAndView = new ModelAndView("admin/building/edit");
        BuildingDTO model = new BuildingDTO();
        if(id != null){

        }
        mdelAndView.addObject("districts" , DataUtil.getDistrict());
        mdelAndView.addObject("buildingTypes" , DataUtil.getBuildingType());
        mdelAndView.addObject("model" , model);
        return mdelAndView;
    }

    private BuildingSearchBuilder initBuildingBuider(BuildingDTO model) {
        BuildingSearchBuilder builder = new BuildingSearchBuilder.builder()
                .setName(model.getName())
                .setNumberOfBasement(model.getNumberOfBasement())
                .setBuildingArea(model.getBuildingArea())
                .setDistrict(model.getDistrict())
                .setStreet(model.getStreet())
                .setWard(model.getWard())
                .setManagerName(model.getManagerName())
                .setManagerPhone(model.getManagerPhone())
                .setAreaRentFrom(model.getAreaRentFrom())
                .setAreaRentTo(model.getAreaRentTo())
                .setCostRentFrom(model.getCosTrentFrom())
                .setCostRentTo(model.getCosTrentTo())
                .setBuildingTypes(model.getBuildingTypes())
                .builder();
        return builder;
    }*/


}
