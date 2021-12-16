package br.atos.projeto.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.atos.projeto.Dto.RequisicaoNovoPedido;

	
	@Controller
	@RequestMapping("/pedido")
	public class PedidoController {

		@GetMapping("/formulario") 
		public String formulario(RequisicaoNovoPedido requisicao) {
			return "pedido/formulario";
		}
		
}
