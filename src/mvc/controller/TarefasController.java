package mvc.controller;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import
org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Tarefa;
import mvc.model.TarefasDAO;
@Controller
public class TarefasController {
	@RequestMapping("/")
	public String lista(Model model) {
		TarefasDAO dao = new TarefasDAO();
		model.addAttribute("tarefas", dao.getLista());
		return "info";
	}
	@RequestMapping("criaTarefa")
	public String form() {
		return "formTarefa";
	}
	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa) {
		TarefasDAO dao = new TarefasDAO();
		dao.adicionaDescricao(tarefa);
		return "adicionada";
	}
	@RequestMapping("deletaTarefa")
	public String deleta(Tarefa tarefa) {
		TarefasDAO dao = new TarefasDAO();
		dao.remove(tarefa);
		return "redirect:/";
	}
}