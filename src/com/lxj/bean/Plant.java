package com.lxj.bean;

import com.lxj.base.BaseElement;

/**
 * ֲ��
 * @author Administrator
 *
 */
public abstract class Plant extends BaseElement {

	protected int life=100;// ����ֵ

	protected int line;// �к�
	protected int row;// �к�

	public Plant(String filepath) {
		super(filepath);
		setScale(0.65);
		setAnchorPoint(0.5f, 0);// �������ĵ�λ��������֮��
	}

	/**
	 * ������
	 * 
	 * @param attack
	 */
	public void attacked(int attack) {
		life -= attack;
		if (life <= 0) {
			destroy();
		}
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getLife() {
		return life;
	}



}