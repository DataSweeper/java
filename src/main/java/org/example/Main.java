package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		String str = "r_id=a2fa2fdf-abc5-4d51-86bf-00778fda77bb,tp=00-8aa2b4e0d315ce3c0c7df37b84d106b1-642cfd295741b83f-01,type=bg,a_id=,s_a_id=,ts=1752539848757,d=0,p=freshservice,svc=sp,pass=1,pl_t=USER_LOGIN,part=4,off=511059154,jid=54f0ef7b8b64,ps=krfk";
		Boolean a = str.matches("r_id.*");
		System.out.println(a);
	}
}