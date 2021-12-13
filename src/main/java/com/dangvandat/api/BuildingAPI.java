package com.dangvandat.api;

/*import com.dangvandat.dto.BuildingDTO;
import com.dangvandat.service.IBuildingService;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/building")
public class BuildingAPI {

    /*@Autowired
    private IBuildingService buildingService;

    @PostMapping
    public BuildingDTO createBuilding(@RequestBody BuildingDTO newBuilding){
        return buildingService.save(newBuilding);
    }*/

}
