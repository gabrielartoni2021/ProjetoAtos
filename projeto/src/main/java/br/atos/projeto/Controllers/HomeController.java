package br.atos.projeto.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.atos.projeto.Models.Pedido;
import br.atos.projeto.Models.StatusPedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Novo Apple iPhone 12 (64 GB, Azul)");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71ZOtNdaZCL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo-Apple-iPhone-12-Azul/dp/B08L5P7DYY/ref=sr_1_8?keywords=iphone+12&qid=1639673579&sr=8-8&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		pedido.setDescricao("uma descrição qualquer para esse pedido");
		pedido.setStatus(StatusPedido.AGUARDANDO);
		
		Pedido pedido2 = new Pedido();
		pedido2.setNomeProduto("Echo Dot (3ª Geração): Smart Speaker com Alexa");
		pedido2.setUrlImagem("https://m.media-amazon.com/images/I/41GZCWFJB1L._AC_.jpg");
		pedido2.setUrlProduto("https://www.amazon.com.br/dp/B07PDHSJ1H/ref=cm_gf_aabk_iaab_iaah_d_p0_e0_qd0_5Aj3NCjcuAWPvhkWUsu8");
		pedido2.setDescricao("uma descrição qualquer para esse pedido");
		pedido2.setStatus(StatusPedido.AGUARDANDO);
		
		Pedido pedido3 = new Pedido();
		pedido3.setNomeProduto("Cadeira Gamer Infantil em Couro PU Preta com Azul Pelegrin");
		pedido3.setUrlImagem("https://m.media-amazon.com/images/I/519VOxHHo+L._AC_SL1200_.jpg");
		pedido3.setUrlProduto("https://www.amazon.com.br/dp/B07BTNTZ92/ref=cm_gf_aabk_iaab_d_p0_e0_qd0_zepatj7vYQi1eAe8K0bb");
		pedido3.setDescricao("uma descrição qualquer para esse pedido");
		pedido.setStatus(StatusPedido.AGUARDANDO);
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido2, pedido3);
		model.addAttribute("pedidos", pedidos);
		
		return "home"; 
	}
}
