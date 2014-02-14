module.exports = {
	mapa : {
		a: '2',
		b: '22',
		c: '222',
		d: '3',
		e: '33',
		f: '333',
		g: '4',
		h: '44',
		i: '444',
		j: '5',
		k: '55',
		l: '555',
		m: '6',
		n: '66',
		o: '666',
		p: '7',
		q: '77',
		r: '777',
		s: '7777',
		t: '8',
		u: '88',
		v: '888',
		w: '9',
		x: '99',
		y: '999',
		z: '9999',
	  ' ': '0'
	},
	transformaEmDigitos : function (frase) {
		
		var resultado = '';
		var atual = '';
		var anterior = '';
		for (var letra in frase){
			atual = this.mapa[frase[letra]][0];
			if (atual === anterior) {
				resultado += '_';
			}
			resultado += this.mapa[frase[letra]];
			anterior = atual;
		}
		return resultado;
	}
}