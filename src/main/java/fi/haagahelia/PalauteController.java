package fi.haagahelia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fi.haagahelia.models.Kysymys;
import fi.haagahelia.models.KysymysRepository;

@Controller
@RequestMapping(value="*")
public class PalauteController {
	
	@Autowired
	private KysymysRepository kysrepo;
	
    @RequestMapping(value="kyssareita.json", method=RequestMethod.GET)
    @ResponseBody
    public List<Kysymys> listaaSisaltoJson() {
    	return kysrepo.findAll();
    }

}
