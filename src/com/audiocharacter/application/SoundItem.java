package com.audiocharacter.application;

public enum SoundItem 
{
	a("a.wav"),b("b.wav"),c("c.wav"),
	d("d.wav"),e("e.wav"),f("f.wav"),
	g("g.wav"),h("h.wav"),i("i.wav"),
	j("j.wav"),k("k.wav"),l("l.wav"),
	m("m.wav"),n("n.wav"),o("o.wav"),
	p("p.wav"),q("q.wav"),r("r.wav"),
	s("s.wav"),t("t.wav"),u("u.wav"),
	v("v.wav"),w("w.wav"),x("x.wav"),
	y("y.wav"),z("z.wav");
	String voice;
	private SoundItem(String voice)
	{
		this.voice = voice ;
	}
	public String getVoice()
	{
		return voice;
		
	}
}
