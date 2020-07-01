package com.upgrad.demo.util;

import com.upgrad.demo.dto.IdeaDTO;
import com.upgrad.demo.entities.IdeaDO;

public class IdeaUtil {

    private IdeaUtil(){
        /**
         * We create it as a private so that nobody can initialize this.
         */
    }

    public static IdeaDO convertIdeaDTOtoIdeaDO(IdeaDTO ideaDTO ){
         IdeaDO ideaDO = new IdeaDO();
         ideaDO.setId(ideaDTO.getId());
         ideaDO.setIdeaName(ideaDTO.getIdeaName());
         ideaDO.setAuthorName(ideaDTO.getAuthorName());
         ideaDO.setIdeaDescription(ideaDTO.getIdeaDescription());

         return ideaDO;
    }

    public static IdeaDTO convertIdeaDOtoIdeaDTO(IdeaDO ideaDO ){
        IdeaDTO ideaDTO = new IdeaDTO();
        ideaDTO.setId(ideaDO.getId());
        ideaDTO.setIdeaName(ideaDO.getIdeaName());
        ideaDTO.setAuthorName(ideaDO.getAuthorName());
        ideaDTO.setIdeaDescription(ideaDO.getIdeaDescription());

        return ideaDTO;
    }

}
