package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import engine.AbstractGame;
import engine.GameContainer;
import game.components.Faction;


public class GameManager extends engine.AbstractGame {

	Renderer renderer;


	
	GameManager(){

		this.renderer = new Renderer();

	}
	
	public void update(GameContainer gc, float dt) {
		
	}
	public void render(Graphics graphics, Canvas canvas) {
		renderer.render(graphics, canvas, this);
	};
	
}
