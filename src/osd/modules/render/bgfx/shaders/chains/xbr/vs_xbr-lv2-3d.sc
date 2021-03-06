$input a_position, a_texcoord0, a_color0
$output v_texcoord0, v_texcoord1, v_color0

// license:BSD-3-Clause
// copyright-holders:Dario Manesku

#include "common.sh"

uniform vec4 XBR_RES;

uniform vec4 u_tex_size0;

void main()
{
	gl_Position = mul(u_viewProj, vec4(a_position.xy, 0.0, 1.0));
	v_texcoord0 = a_texcoord0;

	vec2 ps = XBR_RES.xx / u_tex_size0.xy;
	float dx = ps.x;
	float dy = ps.y;
	v_texcoord1 = vec4(dx,  0,  0, dy); // F H
	v_color0 = a_color0;
}
